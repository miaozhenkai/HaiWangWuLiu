package com.haiwang.logistics.pojo;

public class Dispatch {
    private Integer dispatchId;

    private Integer staffId;

    private String carNum;

    private String waybillId;



    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Waybill getWaybill() {
        return waybill;
    }

    public void setWaybill(Waybill waybill) {
        this.waybill = waybill;
    }

    private Staff staff;
    private Car car;
    private Waybill waybill;

    public Integer getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Integer dispatchId) {
        this.dispatchId = dispatchId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId == null ? null : waybillId.trim();
    }

    @Override
    public String toString() {
        return "Dispatch{" +
                "dispatchId=" + dispatchId +
                ", staffId=" + staffId +
                ", carNum='" + carNum + '\'' +
                ", waybillId='" + waybillId + '\'' +
                ", staff=" + staff +
                ", car=" + car +
                ", waybill=" + waybill +
                '}';
    }
}