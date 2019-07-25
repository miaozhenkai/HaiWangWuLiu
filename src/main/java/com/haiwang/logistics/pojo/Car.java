package com.haiwang.logistics.pojo;

public class Car {
    private String carNum;

    private String carType;

    private Integer carLoad;

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public Integer getCarLoad() {
        return carLoad;
    }

    public void setCarLoad(Integer carLoad) {
        this.carLoad = carLoad;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNum='" + carNum + '\'' +
                ", carType='" + carType + '\'' +
                ", carLoad=" + carLoad +
                '}';
    }
}