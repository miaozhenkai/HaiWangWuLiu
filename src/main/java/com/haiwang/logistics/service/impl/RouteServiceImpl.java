package com.haiwang.logistics.service.impl;

import com.haiwang.logistics.mapper.RouteMapper;
import com.haiwang.logistics.pojo.Route;
import com.haiwang.logistics.pojo.RouteExample;
import com.haiwang.logistics.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteMapper routeMapper;
    @Override
    public List<Route> getRouteByExample(RouteExample routeExample) {
        List<Route> routeList=routeMapper.selectByExample(routeExample);
        return routeList;
    }

    @Override
    public double getPriceByPrvoinces(String prvoinces1, String prvoinces2,double itemWeight) {
        double routeprice=0;
        double itemprice=0;
        double waybillprice=0;
        RouteExample routeExample=new RouteExample();
        routeExample.createCriteria().andPrvoinces1EqualTo(prvoinces1).andPrvoinces2EqualTo(prvoinces2);
        List<Route> routeList=routeMapper.selectByExample(routeExample);
        if (routeList!=null&& routeList.size() > 0){
            Route route=routeList.get(0);
            routeprice=route.getRoutePrice();
        }if(routeList.size()<1) {
            RouteExample routeExample1=new RouteExample();
            routeExample1.createCriteria().andPrvoinces1EqualTo(prvoinces2).andPrvoinces2EqualTo(prvoinces1);
            List<Route> routeList1=routeMapper.selectByExample(routeExample1);
            //判断集合是否为空  若集合为空调用get方法则下标越界异常
            if(routeList1!=null&& routeList1.size()>0){
                routeprice=routeList1.get(0).getRoutePrice();
            }
        }
        if (itemWeight>5){
            itemprice=10+(itemWeight-5)*1;
        }if (itemWeight<=5){
            itemprice=10;
        }
        System.out.println("routeprice"+routeprice);
        System.out.println("itemprice"+itemprice);
        waybillprice=routeprice+itemprice;
        return waybillprice;
    }
}
