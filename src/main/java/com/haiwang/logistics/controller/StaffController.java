package com.haiwang.logistics.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiwang.logistics.pojo.*;
import com.haiwang.logistics.service.DepartmentService;
import com.haiwang.logistics.service.FirmService;
import com.haiwang.logistics.service.StaffService;


import com.haiwang.logistics.service.WaybillService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;
    @Autowired
    private FirmService firmService;
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private WaybillService waybillService;

    @ResponseBody
    @RequestMapping("/staffList")
    public String showStaffList(int page, int limit, String sarchPhone, String sarchName, String sarchSex, HttpSession session) {
        //读firmList
        List<Firm> firmList = firmService.getFirmAllByExample(new FirmExample());
        session.setAttribute("firmList", firmList);
        //读departmentList
        List<Department> departmentList = departmentService.getDepartmenAllByExample(new DepartmentExample());
        session.setAttribute("departmentList", departmentList);
        //多条件分页查询
        StaffExample staffExample = new StaffExample();
        staffExample.setOrderByClause("staff_id");
        String staffNameLike = "%" + sarchName + "%";
        String staffPhoneLike = "%" + sarchPhone + "%";
        String staffSexLike = "%" + sarchSex + "%";
        if (sarchName != null && sarchPhone == null && sarchSex == null) {
            staffExample.createCriteria().andStaffNameLike(staffNameLike);
        }
        if (sarchName == null && sarchPhone != null && sarchSex == null) {
            staffExample.createCriteria().andStaffPhoneLike(staffPhoneLike);
        }
        if (sarchName != null && sarchPhone != null && sarchSex == null) {
            staffExample.createCriteria().andStaffNameLike(staffNameLike).andStaffPhoneLike(staffPhoneLike);
        }
        if (sarchSex != null && sarchName == null && sarchPhone == null) {
            staffExample.createCriteria().andStaffSexLike(staffSexLike);
        }
        if (sarchSex != null && sarchName != null && sarchPhone == null) {
            staffExample.createCriteria().andStaffSexLike(staffSexLike).andStaffNameLike(staffNameLike);
        }
        if (sarchSex != null && sarchName == null && sarchPhone != null) {
            staffExample.createCriteria().andStaffSexLike(staffSexLike).andStaffPhoneLike(staffPhoneLike);
        }
        if (sarchSex != null && sarchName != null && sarchPhone != null) {
            staffExample.createCriteria().andStaffSexLike(staffSexLike).andStaffPhoneLike(staffPhoneLike).andStaffNameLike(staffNameLike);
        }
        PageHelper.startPage(page, limit);
        List<Staff> staffList = staffService.getStaffAllByExample(staffExample);
        PageInfo<Staff> pageInfo = new PageInfo<Staff>(staffList);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", pageInfo.getTotal());
        jsonObject.put("data", pageInfo.getList());
        return jsonObject.toString();
    }

    @ResponseBody
    @RequestMapping("/addStaff")
    public String addStaff(@RequestBody Staff staff) {
        String s = "";
        boolean b = staffService.addStaff(staff);
        if (b) {
            s = "添加成功";
        } else {
            s = "添加失败";
        }
        return s;
    }

    @ResponseBody
    @RequestMapping("/delStaff")
    public String delStaff(int staffId) {
        String s;
        boolean b = staffService.delStaffByStaffId(staffId);
        if (b) {
            s = "删除成功";
        } else {
            s = "删除失败";
        }
        return s;
    }

    @ResponseBody
    @RequestMapping("/updateStaff")
    public String updateStaff(@RequestBody Staff staff) {
        String s;
        boolean b = staffService.updateStaff(staff);
        if (b) {
            s = "修改成功";
        } else {
            s = "修改失败";
        }
        return s;
    }

    //前台部分
    // 快递员登录
//  @ResponseBody
    @RequestMapping("/staffLogin")
            public String login(String staffUserName,String staffPwd,HttpSession session){
                Map<Object,Object> map=staffService.staffLogin(staffUserName,staffPwd);
                if("ok".equals(map.get("s"))){
                    session.setAttribute("staff",map.get("staff"));
                    //登陆成功
                    return "redirect:/StaffPage.jsp";
                }else {
                    //登陆失败
                    return "redirect:/StaffLogin.jsp";
                }
            }
}