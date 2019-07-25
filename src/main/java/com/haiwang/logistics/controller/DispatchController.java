package com.haiwang.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiwang.logistics.pojo.Dispatch;
import com.haiwang.logistics.pojo.DispatchExample;
import com.haiwang.logistics.service.DispatchService;
import org.apache.ibatis.annotations.ResultMap;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/6/16
 * TIME:21:30
 */
@Controller
@RequestMapping("/dispatch")
public class DispatchController {

    @Autowired
    private DispatchService dispatchService;

    @ResponseBody
    @RequestMapping("/dispatchList")
    public Object showDispatchList(int page, int limit ){
        DispatchExample example=new DispatchExample();
        PageHelper.startPage(page, limit);
        List<Dispatch> dispatchlist=dispatchService.getDispatchAllByExample(example);
        PageInfo<Dispatch> pageInfo = new PageInfo<Dispatch>(dispatchlist);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", pageInfo.getTotal());
        jsonObject.put("data", pageInfo.getList());
        return jsonObject.toString();
    }

}
