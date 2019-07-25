package com.haiwang.logistics.service;

import com.haiwang.logistics.pojo.Route;
import com.haiwang.logistics.pojo.RouteExample;

import java.util.List;

public interface RouteService {
    public List<Route> getRouteByExample(RouteExample routeExample);

    //查路费
    public double getPriceByPrvoinces(String prvoinces1,String prvoinces2,double itemWeight);
}
