package com.haiwang.logistics.service;

import com.haiwang.logistics.pojo.Department;
import com.haiwang.logistics.pojo.DepartmentExample;

import java.util.List;

public interface DepartmentService {
    public List<Department> getDepartmenAllByExample(DepartmentExample departmentExample);

    public boolean addDepartment(Department department);

    public boolean delDepartmentByDepartmentId(int departmentId);

    public boolean updateDepartment(Department department);
}
