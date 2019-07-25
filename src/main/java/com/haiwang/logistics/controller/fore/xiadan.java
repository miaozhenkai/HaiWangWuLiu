package com.haiwang.logistics.controller.fore;

import com.haiwang.logistics.pojo.Waybill;
import com.haiwang.logistics.pojo.WaybillExample;
import com.haiwang.logistics.service.StaffService;
import com.haiwang.logistics.service.WaybillService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/xiadan")
public class xiadan {
    @Autowired
    private WaybillService waybillService;
    @Autowired
    private StaffService staffService;

    @RequestMapping("/xiadan")
    public void xiadan(Waybill waybill){
        Date date=new Date();
        //Date转换String
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        waybill.setWaybillId(sdf.format(date));
        waybill.setWaybillDate(date);
        waybill.setStaff1Id(staffService.getStaff1(waybill.getSenderProvinces()).getStaffId());
        String s="正在发往"+waybill.getReceiverProvinces();
        waybill.setWaybillState(s);
        waybillService.insert(waybill);
        System.out.println(waybill.getWaybillId()+waybill.getWaybillDate()+waybill.getSenderName()+waybill.getSenderAddress());
    }
    @ResponseBody
    @RequestMapping("/chaxun")
    public String chaxun(Waybill waybill){
        WaybillExample waybillExample=new WaybillExample();
        waybillExample.createCriteria().andWaybillIdEqualTo(waybill.getWaybillId());
        List<Waybill> waybillList =waybillService.getAllWaybillByExample(waybillExample);
        return new JSONObject(waybillList.get(0)).toString();
    }
}
