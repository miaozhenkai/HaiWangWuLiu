package com.haiwang.logistics.service;

import com.haiwang.logistics.pojo.Staff;
import com.haiwang.logistics.pojo.StaffExample;
import com.haiwang.logistics.pojo.Waybill;
import com.haiwang.logistics.pojo.WaybillExample;

import java.util.List;
import java.util.Map;

public interface StaffService {
    public List<Staff> getStaffAllByExample(StaffExample staffExample);

    public boolean addStaff(Staff staff);

    public boolean delStaffByStaffId(int staffId);

    public boolean updateStaff(Staff staff);

    //快递员登录，查看自己是否要派送物件
    public Map<Object,Object> staffLogin(String staffUserName, String staffPassword);

    //分配取件员
    public Staff getStaff1(String senderProvinces);
    //分配派送员
    public Staff getStaff2(String receiverProvinces);




}
