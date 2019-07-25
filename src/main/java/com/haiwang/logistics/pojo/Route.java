package com.haiwang.logistics.pojo;

public class Route {
    private Integer routeId;

    private String prvoinces1;

    private String prvoinces2;

    private Double routePrice;

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getPrvoinces1() {
        return prvoinces1;
    }

    public void setPrvoinces1(String prvoinces1) {
        this.prvoinces1 = prvoinces1 == null ? null : prvoinces1.trim();
    }

    public String getPrvoinces2() {
        return prvoinces2;
    }

    public void setPrvoinces2(String prvoinces2) {
        this.prvoinces2 = prvoinces2 == null ? null : prvoinces2.trim();
    }

    public Double getRoutePrice() {
        return routePrice;
    }

    public void setRoutePrice(Double routePrice) {
        this.routePrice = routePrice;
    }
}