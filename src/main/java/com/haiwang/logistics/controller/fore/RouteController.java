package com.haiwang.logistics.controller.fore;

import com.haiwang.logistics.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/route")
public class RouteController {
    @Autowired
    private RouteService routeService;
    @ResponseBody
    @RequestMapping("/route1")
    private Double price(HttpServletRequest request){
        double itemWeight= Double.parseDouble(request.getParameter("itemWeight"));
        String senderProvinces=request.getParameter("senderProvinces");
        String receiverProvinces=request.getParameter("receiverProvinces");
//        double i=routeService.getPriceByPrvoinces("北京市","辽宁省大连市",10);
        double i=routeService.getPriceByPrvoinces(senderProvinces,receiverProvinces,itemWeight);
        System.out.println("p"+i);
        return i;
    }

}
