package com.haiwang.logistics.pojo;

public class Firm {
    private Integer firmId;

    private String firmName;

    public Integer getFirmId() {
        return firmId;
    }

    public void setFirmId(Integer firmId) {
        this.firmId = firmId;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName == null ? null : firmName.trim();
    }

    @Override
    public String toString() {
        return "Firm{" +
                "firmId=" + firmId +
                ", firmName='" + firmName + '\'' +
                '}';
    }
}