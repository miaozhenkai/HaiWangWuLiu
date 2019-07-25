package com.haiwang.logistics.controller.fore;

import com.haiwang.logistics.pojo.Staff;
import com.haiwang.logistics.pojo.StaffExample;
import com.haiwang.logistics.pojo.Waybill;
import com.haiwang.logistics.pojo.WaybillExample;
import com.haiwang.logistics.service.StaffService;
import com.haiwang.logistics.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class StaffController2 {
    @Autowired
    private StaffService staffService;
    @Autowired
    private WaybillService wservice;
    @RequestMapping("/test")
    public void StaffLogin(){
        List<Waybill> waybillList=wservice.getAllWaybillByExample(new WaybillExample());
        System.out.println(waybillList.get(0));

    }
}
