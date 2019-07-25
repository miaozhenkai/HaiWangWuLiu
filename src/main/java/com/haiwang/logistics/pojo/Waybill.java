package com.haiwang.logistics.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Waybill {
    private String waybillId;

    private String senderName;

    private String senderPhone;

    private String senderProvinces;

    private String senderAddress;

    private String receiverName;

    private String receiverPhone;

    private String receiverProvinces;

    private String receiverAddress;

    private String waybillState;

    private Date waybillDate;

    private Double waybillPrice;

    private String waybillPayment;

    private String itemType;

    private Double itemWeight;

    private Integer staff1Id;

    private Integer staff2Id;

    private Staff staff1;

    public Staff getStaff1() {
        return staff1;
    }

    public void setStaff1(Staff staff1) {
        this.staff1 = staff1;
    }

    public Staff getStaff2() {
        return staff2;
    }

    public void setStaff2(Staff staff2) {
        this.staff2 = staff2;
    }

    private Staff staff2;

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId == null ? null : waybillId.trim();
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone == null ? null : senderPhone.trim();
    }

    public String getSenderProvinces() {
        return senderProvinces;
    }

    public void setSenderProvinces(String senderProvinces) {
        this.senderProvinces = senderProvinces == null ? null : senderProvinces.trim();
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress == null ? null : senderAddress.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getReceiverProvinces() {
        return receiverProvinces;
    }

    public void setReceiverProvinces(String receiverProvinces) {
        this.receiverProvinces = receiverProvinces == null ? null : receiverProvinces.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getWaybillState() {
        return waybillState;
    }

    public void setWaybillState(String waybillState) {
        this.waybillState = waybillState == null ? null : waybillState.trim();
    }

    public Date getWaybillDate() {
        return waybillDate;
    }

    public void setWaybillDate(Date waybillDate) {
        this.waybillDate = waybillDate;
    }

    public Double getWaybillPrice() {
        return waybillPrice;
    }

    public void setWaybillPrice(Double waybillPrice) {
        this.waybillPrice = waybillPrice;
    }

    public String getWaybillPayment() {
        return waybillPayment;
    }

    public void setWaybillPayment(String waybillPayment) {
        this.waybillPayment = waybillPayment == null ? null : waybillPayment.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public Double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Integer getStaff1Id() {
        return staff1Id;
    }

    public void setStaff1Id(Integer staff1Id) {
        this.staff1Id = staff1Id;
    }

    public Integer getStaff2Id() {
        return staff2Id;
    }

    public void setStaff2Id(Integer staff2Id) {
        this.staff2Id = staff2Id;
    }

    public Waybill() {
    }

    public Waybill(String waybillId, String senderName, String senderPhone, String senderProvinces, String senderAddress, String receiverName, String receiverPhone, String receiverProvinces, String receiverAddress, String waybillState, Date waybillDate, Double waybillPrice, String waybillPayment, String itemType, Double itemWeight, Integer staff1Id, Integer staff2Id) {
        this.waybillId = waybillId;
        this.senderName = senderName;
        this.senderPhone = senderPhone;
        this.senderProvinces = senderProvinces;
        this.senderAddress = senderAddress;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverProvinces = receiverProvinces;
        this.receiverAddress = receiverAddress;
        this.waybillState = waybillState;
        this.waybillDate = waybillDate;
        this.waybillPrice = waybillPrice;
        this.waybillPayment = waybillPayment;
        this.itemType = itemType;
        this.itemWeight = itemWeight;
        this.staff1Id = staff1Id;
        this.staff2Id = staff2Id;
    }

    @Override
    public String toString() {
        return "Waybill{" +
                "waybillId='" + waybillId + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderPhone='" + senderPhone + '\'' +
                ", senderProvinces='" + senderProvinces + '\'' +
                ", senderAddress='" + senderAddress + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", receiverProvinces='" + receiverProvinces + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", waybillState='" + waybillState + '\'' +
                ", waybillDate=" + waybillDate +
                ", waybillPrice=" + waybillPrice +
                ", waybillPayment='" + waybillPayment + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemWeight=" + itemWeight +
                ", staff1Id=" + staff1Id +
                ", staff2Id=" + staff2Id +
                ", staff1=" + staff1 +
                ", staff2=" + staff2 +
                '}';
    }
}