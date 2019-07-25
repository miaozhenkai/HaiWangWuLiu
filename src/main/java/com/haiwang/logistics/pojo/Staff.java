package com.haiwang.logistics.pojo;

import java.util.Date;

public class Staff {
    private Integer staffId;

    private String staffName;

    private String staffSex;

    private Date staffBirthday;

    private String staffPhone;

    private String staffUsername;

    private String staffPassword;

    private Integer departmentId;

    private Integer firmId;

    private Department department;

    private Firm firm;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public Date getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(Date staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername == null ? null : staffUsername.trim();
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword == null ? null : staffPassword.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getFirmId() {
        return firmId;
    }

    public void setFirmId(Integer firmId) {
        this.firmId = firmId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", staffSex='" + staffSex + '\'' +
                ", staffBirthday=" + staffBirthday +
                ", staffPhone='" + staffPhone + '\'' +
                ", staffUsername='" + staffUsername + '\'' +
                ", staffPassword='" + staffPassword + '\'' +
                ", departmentId=" + departmentId +
                ", firmId=" + firmId +
                ", department=" + department +
                ", firm=" + firm +
                '}';
    }
}