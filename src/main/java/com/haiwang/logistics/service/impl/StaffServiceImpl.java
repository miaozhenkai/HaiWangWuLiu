package com.haiwang.logistics.service.impl;

import com.haiwang.logistics.mapper.StaffMapper;
import com.haiwang.logistics.pojo.Admin;
import com.haiwang.logistics.pojo.AdminExample;
import com.haiwang.logistics.pojo.Staff;
import com.haiwang.logistics.pojo.StaffExample;
import com.haiwang.logistics.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> getStaffAllByExample(StaffExample staffExample) {
        List<Staff> staffList = staffMapper.getStaffAllByExample(staffExample);
        return staffList;
    }

    @Override
    public boolean addStaff(Staff staff) {
        boolean b = false;
        int i = staffMapper.insert(staff);
        if (i > 0) {
            b = true;
        }
        return b;
    }

    @Override
    public boolean delStaffByStaffId(int staffId) {
        boolean b=false;
        int i=staffMapper.deleteByPrimaryKey(staffId);
        if (i > 0) {
            b = true;
        }
        return b;
    }

    @Override
    public boolean updateStaff(Staff staff) {
        boolean b=false;
        int i=staffMapper.updateByPrimaryKey(staff);
        if (i > 0) {
            b = true;
        }
        return b;
    }

    //快递员登录，查看自己是否要送快递
    @Override
    public Map<Object,Object> staffLogin(String staffUserName, String staffPassword) {
        String s="no";
        Map<Object,Object> map=new HashMap<>();
        StaffExample staffExample=new StaffExample();
        staffExample.createCriteria().andStaffUsernameEqualTo(staffUserName);
        List<Staff> staffList=staffMapper.selectByExample(staffExample);
        if(staffList!=null && staffList.size()>0){
            Staff staff=staffList.get(0);
            if(staff.getStaffPassword().equals(staffPassword)){
                //登陆成功
                map.put("staff",staff);
                s="ok";
            }
        }
        map.put("s",s);
        return map;

    }

    @Override
    public Staff getStaff1(String senderProvinces) {
        String s="";
        if(senderProvinces.indexOf("省")==-1){
            s=senderProvinces.substring(0,senderProvinces.indexOf("市"));
        }else {
            s=senderProvinces.substring(senderProvinces.indexOf("省")+1,senderProvinces.indexOf("市"));
        }
        System.out.println(s);
        List<Staff> staffList=staffMapper.getStaff1("派送部","%"+s+"%");
        Random random = new Random();
        int n = random.nextInt(staffList.size());
        System.out.println("派送员："+staffList);
        return staffList.get(n);
    }
    @Override
    public Staff getStaff2(String receiverProvinces) {
        return null;
    }

}
