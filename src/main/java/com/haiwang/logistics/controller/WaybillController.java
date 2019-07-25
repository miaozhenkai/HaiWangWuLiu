package com.haiwang.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiwang.logistics.pojo.Staff;
import com.haiwang.logistics.pojo.StaffExample;
import com.haiwang.logistics.pojo.Waybill;
import com.haiwang.logistics.pojo.WaybillExample;
import com.haiwang.logistics.service.StaffService;
import com.haiwang.logistics.service.WaybillService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/waybill")
public class WaybillController {
    @Autowired
    private WaybillService wservice;
    @Autowired
    private StaffService staffService;
    //1.查所有
    @ResponseBody
    @RequestMapping("/selectAll")
    public String select(Integer page, Integer limit, String sarchSPhone, String sarchSName, String sarchRName, HttpSession session){
        List<Staff> staffList=staffService.getStaffAllByExample(new StaffExample());
        session.setAttribute("staffList",staffList);
        //查询条件：发件人电话，发件人姓名，收件人姓名
        System.out.println(sarchSName+"qq"+sarchSPhone);
        WaybillExample waybillExample=new WaybillExample();
        waybillExample.setOrderByClause("waybill_id");
        String senderNameLike = "%" + sarchSName+ "%";//发件人姓名
        String senderPhoneLike = "%" + sarchSPhone+ "%";//发件人电话
        String receiverNameLike ="%" + sarchRName+ "%";//收件人姓名
        if (sarchSName!=null&&sarchSPhone==null&&sarchRName==null){
            waybillExample.createCriteria().andSenderNameLike(senderNameLike);
        }if (sarchSName==null&&sarchSPhone!=null&&sarchRName==null){
            waybillExample.createCriteria().andSenderPhoneLike(senderPhoneLike);
        }if (sarchSName!=null&&sarchSPhone!=null&&sarchRName==null){
            waybillExample.createCriteria().andSenderNameLike(senderNameLike).andSenderPhoneLike(senderPhoneLike);
        }if (sarchRName!=null&&sarchSName==null&&sarchSPhone==null){
            waybillExample.createCriteria().andReceiverNameLike(receiverNameLike);
        }if (sarchRName!=null&&sarchSName!=null&&sarchSPhone==null){
            waybillExample.createCriteria().andReceiverNameLike(receiverNameLike).andSenderNameLike(senderNameLike);
        }if (sarchRName!=null&&sarchSName==null&&sarchSPhone!=null){
            waybillExample.createCriteria().andReceiverNameLike(receiverNameLike).andSenderPhoneLike(senderPhoneLike);
        }if (sarchRName!=null&&sarchSName!=null&&sarchSPhone!=null){
            waybillExample.createCriteria().andReceiverNameLike(receiverNameLike).andSenderPhoneLike(senderPhoneLike).andSenderNameLike(senderNameLike);
        }
        PageHelper.startPage(page,limit);
        List<Waybill> waybillList=wservice.getAllWaybillByExample(waybillExample);
        PageInfo<Waybill> pageInfo=new PageInfo<Waybill>(waybillList);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code","0");
        jsonObject.put("msg","");
        jsonObject.put("count",pageInfo.getTotal());
        jsonObject.put("data",pageInfo.getList());
        return jsonObject.toString();
    }

    //3.删除运单
    @ResponseBody
    @RequestMapping("/delete")
    public String delete( String waybillId){
       String s=wservice.deleteByPrimaryKey(waybillId);
        System.out.println(s);
        if("ok".equals(s)){
            //删除成功
            s="删除成功！";
        }else {
            //删除失败
            s="删除失败！";
        }
        System.out.println(s);
       return s;
    }

    //2.增加运单
    @ResponseBody
    @RequestMapping("/addWaybill")
    public String insert(@RequestBody Waybill waybill){
        String s=wservice.insert(waybill);
        System.out.println(s);

        if("ok".equals(s)){
            //增加成功
            s="增加成功！";
        }else {
            //增加失败
            s="增加失败了！";
        }
        System.out.println(s);
        return s;
    }

    //4.更新运单
    @ResponseBody
    @RequestMapping("/updateWaybill")
    public String update(String json){
        System.out.println(json);
        Waybill waybill=new Waybill();
        JSONObject jsonObject = new JSONObject(json);
        String waybillId = jsonObject.getString("waybillId");
        waybill.setWaybillId(waybillId);
        String senderName=jsonObject.getString("senderName");
        waybill.setSenderName(senderName);
        String senderPhone=jsonObject.getString("senderPhone");
        waybill.setSenderPhone(senderPhone);
        String senderProvinces=jsonObject.getString("senderProvinces");
        waybill.setSenderProvinces(senderProvinces);
        String senderAddress=jsonObject.getString("senderAddress");
        waybill.setSenderAddress(senderAddress);
        String receiverName=jsonObject.getString("receiverName");
        waybill.setReceiverName(receiverName);
        String receiverPhone=jsonObject.getString("receiverPhone");
        waybill.setReceiverPhone(receiverPhone);
        String receiverProvinces=jsonObject.getString("receiverProvinces");
        waybill.setReceiverProvinces(receiverProvinces);
        String receiverAddress=jsonObject.getString("receiverAddress");
        waybill.setReceiverAddress(receiverAddress);
        String waybillState=jsonObject.getString("waybillState");
        waybill.setWaybillState(waybillState);
        if (!jsonObject.getString("waybillPrice").equals("")){
            double waybillPrice= Double.parseDouble(jsonObject.getString("waybillPrice"));
            waybill.setWaybillPrice(waybillPrice);
        }
        String waybillPayment=jsonObject.getString("waybillPayment");
        waybill.setWaybillPayment(waybillPayment);
        String itemType=jsonObject.getString("itemType");
        waybill.setItemType(itemType);
        if (!jsonObject.getString("itemWeight").equals("")){
            double itemWeight= Double.parseDouble(jsonObject.getString("itemWeight"));
            waybill.setItemWeight(itemWeight);
        }
        if (!jsonObject.getString("staff1Id").equals("")){
            int staff1Id= Integer.parseInt(jsonObject.getString("staff1Id"));
            waybill.setStaff1Id(staff1Id);
        }
        if (!jsonObject.getString("staff2Id").equals("")){
            int staff2Id= Integer.parseInt(jsonObject.getString("staff2Id"));
            waybill.setStaff2Id(staff2Id);
        }
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date waybillDate= null;
        try {
            waybillDate = simpleDateFormat.parse(jsonObject.getString("waybillDate"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        waybill.setWaybillDate(waybillDate);
        System.out.println(waybill);
        String s=wservice.update(waybill);
        System.out.println(s);
        if("ok".equals(s)){
            //更新成功
            s="更新成功！";
        }else {
            //更新失败
            s="更新失败了！";
        }
        return s;
    }
}