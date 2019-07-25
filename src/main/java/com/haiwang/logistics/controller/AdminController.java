package com.haiwang.logistics.controller;

import com.haiwang.logistics.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("/login")
    public String adminLogin(String username, String password, HttpSession session) {
        System.out.println("qq" + username + password);
        int i = 0;
        boolean b = adminService.adminLogin(username, password);
        if (b) {
            //登录成功
            session.setAttribute("adminName", username);
            i = 1;
        } else {
            i = 0;
        }
        return String.valueOf(i);
    }

}
