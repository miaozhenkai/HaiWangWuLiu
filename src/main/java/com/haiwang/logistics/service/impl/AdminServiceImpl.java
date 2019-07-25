package com.haiwang.logistics.service.impl;

import com.haiwang.logistics.mapper.AdminMapper;
import com.haiwang.logistics.pojo.Admin;
import com.haiwang.logistics.pojo.AdminExample;
import com.haiwang.logistics.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean adminLogin(String username, String password) {
        boolean b = false;
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAAccountEqualTo(username);
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        if (adminList != null && adminList.size() > 0) {
            Admin admin = adminList.get(0);
            if (admin.getaPassword().equals(password)) {
                b = true;
            }
        }
        return b;
    }
}
