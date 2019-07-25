package com.haiwang.logistics.service.impl;

import com.haiwang.logistics.mapper.DepartmentMapper;
import com.haiwang.logistics.pojo.Department;
import com.haiwang.logistics.pojo.DepartmentExample;
import com.haiwang.logistics.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getDepartmenAllByExample(DepartmentExample departmentExample) {
        List<Department> departmentList = departmentMapper.selectByExample(departmentExample);
        return departmentList;
    }

    @Override
    public boolean addDepartment(Department department) {
        boolean b=false;
        int i=departmentMapper.insert(department);
        if (i>0){
            b=true;
        }
        return b;
    }

    @Override
    public boolean delDepartmentByDepartmentId(int departmentId) {
        boolean b=false;
        int i=departmentMapper.deleteByPrimaryKey(departmentId);
        if (i>0){
            b=true;
        }
        return b;
    }

    @Override
    public boolean updateDepartment(Department department) {
        boolean b=false;
        int i=departmentMapper.updateByPrimaryKey(department);
        if (i>0){
            b=true;
        }
        return b;
    }
}
