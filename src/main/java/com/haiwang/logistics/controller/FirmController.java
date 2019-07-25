package com.haiwang.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiwang.logistics.pojo.Firm;
import com.haiwang.logistics.pojo.FirmExample;
import com.haiwang.logistics.service.FirmService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/firm")
public class FirmController {
    @Autowired
    private FirmService firmService;

    @ResponseBody
    @RequestMapping("/firmList")
    public String showfirmList(int page, int limit,String firmName) {
        //多条件分页查询
        FirmExample firmExample=new FirmExample();
        firmExample.setOrderByClause("firm_id");
        String firmNameLike="%"+firmName+"%";
        if (firmName!=null){
            firmExample.createCriteria().andFirmNameLike(firmNameLike);
        }
        PageHelper.startPage(page,limit);
        List<Firm> firmList=firmService.getFirmAllByExample(firmExample);
        PageInfo<Firm> pageInfo=new PageInfo<Firm>(firmList);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", pageInfo.getTotal());
        jsonObject.put("data", pageInfo.getList());
        return jsonObject.toString();

    }

    @ResponseBody
    @RequestMapping("/addFirm")
    public String addFirm(@RequestBody Firm firm){
        String s;
        boolean b=firmService.saveFirm(firm);
        if (b){
            s="添加成功";
        }
        else {
            s="添加失败";
        }
        return s;
    }

    @ResponseBody
    @RequestMapping("/delFirm")
    public String addFirm(Integer firmId){
        String s;
        boolean b=firmService.delFirmByFirmId(firmId);
        if (b){
            s="删除成功";
        }
        else {
            s="删除失败";
        }
        return s;
    }

    @ResponseBody
    @RequestMapping("/updateFirm")
    public String updateFirm(@RequestBody Firm firm){
        String s;
        boolean b=firmService.updateFirm(firm);
        if (b){
            s="修改成功";
        }
        else {
            s="修改失败";
        }
        return s;
    }

}
