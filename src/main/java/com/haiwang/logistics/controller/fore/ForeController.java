package com.haiwang.logistics.controller.fore;

import com.haiwang.logistics.pojo.Waybill;
import com.haiwang.logistics.pojo.WaybillExample;
import com.haiwang.logistics.service.StaffService;
import com.haiwang.logistics.service.WaybillService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/fore")
public class ForeController {
    @Autowired
    private WaybillService wservice;
    @Autowired
    private StaffService staffService;
    //
    //点击按钮查询此快递员已取过的件
    @ResponseBody
    @RequestMapping("/selectHasGet")
    public String selectHasGet(Integer staffId, HttpSession session){
        WaybillExample waybillExample=new WaybillExample();
        waybillExample.createCriteria().andStaff1IdEqualTo(staffId).andItemWeightIsNotNull();
        List<Waybill> waybillslist=wservice.getAllWaybillByExample(waybillExample);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", waybillslist.size());
        jsonObject.put("data", waybillslist);
        return jsonObject.toString();
    }


    //点击按钮查询此快递员没有取过的件
    @ResponseBody
    @RequestMapping("/selectNoGet")
    public String selectNoGet(Integer staffId){
//        System.out.println(111);
//        System.out.println("staffId"+staffId);
        WaybillExample waybillExample=new WaybillExample();
        waybillExample.createCriteria().andStaff1IdEqualTo(staffId).andItemWeightIsNull();
        List<Waybill> waybillslist=wservice.getAllWaybillByExample(waybillExample);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", waybillslist.size());
        jsonObject.put("data", waybillslist);
        return jsonObject.toString();
    }

    @ResponseBody
    @RequestMapping("/NoSend")
    public String NoSend(Integer staffId){
        WaybillExample waybillExample=new WaybillExample();
        waybillExample.createCriteria().andStaff2IdEqualTo(staffId).andWaybillStateNotEqualTo("订单已完成").andItemWeightIsNotNull();
        List<Waybill> waybillslist=wservice.getAllWaybillByExample(waybillExample);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", waybillslist.size());
        jsonObject.put("data", waybillslist);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
    @ResponseBody
    @RequestMapping("/HasSend")
    public String HasSend(Integer staffId){
        WaybillExample waybillExample=new WaybillExample();
        waybillExample.createCriteria().andStaff2IdEqualTo(staffId).andWaybillStateEqualTo("订单已完成");
        List<Waybill> waybillslist=wservice.getAllWaybillByExample(waybillExample);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", waybillslist.size());
        jsonObject.put("data", waybillslist);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
    @ResponseBody
    @RequestMapping("/send")
    public String HasSend(String waybillId){
        System.out.println(waybillId);
        WaybillExample waybillExample=new WaybillExample();
        waybillExample.createCriteria().andWaybillIdEqualTo(waybillId);
        List<Waybill> waybillslist=wservice.getAllWaybillByExample(waybillExample);
        Waybill waybill1=waybillslist.get(0);
        waybill1.setWaybillState("订单已完成");
        String s=wservice.update(waybill1);
        String s1="";
        if (s.equals("ok")){
            s1="ok";
        }else {
            s1="失败";
        }
        return s1;
    }
    //根据订单号回显添加数据（重量）
    @RequestMapping("/selectByWaybillId")
    public String selectByWaybillId(String waybillId, HttpSession session){
        WaybillExample waybillExample=new WaybillExample();
        waybillExample.createCriteria().andWaybillIdEqualTo(waybillId);
        List<Waybill> wayList=wservice.getAllWaybillByExample(waybillExample);
        session.setAttribute("wayList",wayList);
        for (Waybill waybill:wayList){
            System.out.println(waybill);
        }
        return "redirect:/write.jsp";
    }

    //更新
    @ResponseBody
    @RequestMapping("/updateW")
    public String updateW(String json){
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
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date waybillDate= null;
        try {
            waybillDate = simpleDateFormat.parse(jsonObject.getString("waybillDate"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        waybill.setWaybillDate(waybillDate);
        waybill.setWaybillState("正在派送中");
        waybill.setStaff2Id(staffService.getStaff1(waybill.getReceiverProvinces()).getStaffId());
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
        System.out.println(s);
        return s;
}
}
