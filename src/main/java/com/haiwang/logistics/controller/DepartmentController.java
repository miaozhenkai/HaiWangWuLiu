package com.haiwang.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiwang.logistics.pojo.Department;
import com.haiwang.logistics.pojo.DepartmentExample;
import com.haiwang.logistics.service.DepartmentService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @ResponseBody
    @RequestMapping("/departmentList")
    public String showStaffList(int page, int limit, String sarchDepartmentName) {
        DepartmentExample departmentExample=new DepartmentExample();
        if (sarchDepartmentName!=null){
            departmentExample.createCriteria().andDepartmentNameLike("%"+sarchDepartmentName+"%");
        }
        PageHelper.startPage(page, limit);
        List<Department> departmentList=departmentService.getDepartmenAllByExample(departmentExample);
        PageInfo<Department> pageInfo = new PageInfo<Department>(departmentList);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", pageInfo.getTotal());
        jsonObject.put("data", pageInfo.getList());
        return jsonObject.toString();
    }
    @ResponseBody
    @RequestMapping("/addDepartment")
    public String addDepartment(@RequestBody Department department) {
        String s;
        boolean b = departmentService.addDepartment(department);
        if (b) {
            s = "添加成功";
        } else {
            s = "添加失败";
        }
        return s;
    }
    @ResponseBody
    @RequestMapping("/delDepartment")
    public String delDepartment(int departmentId) {
        String s;
        boolean b = departmentService.delDepartmentByDepartmentId(departmentId);
        if (b) {
            s = "删除成功";
        } else {
            s = "删除失败";
        }
        return s;
    }
    @ResponseBody
    @RequestMapping("/updateDepartment")
    public String updateDepartment(@RequestBody Department department) {
        String s;
        boolean b = departmentService.updateDepartment(department);
        if (b) {
            s = "修改成功";
        } else {
            s = "修改失败";
        }
        return s;
    }
}
