package com.haiwang.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiwang.logistics.mapper.WaybillMapper;
import com.haiwang.logistics.pojo.Waybill;
import com.haiwang.logistics.pojo.WaybillExample;
import com.haiwang.logistics.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author 刘顺玲
 * @version 1.0
 * @title: WaybillServiceImpl
 * @projectName：HaiWangWuLiu
 * @description:
 * @date 2019/6/17  19:22
 */
@Service
public class WaybillServiceImpl implements WaybillService {

    @Autowired
    private WaybillMapper wmapper;

    //1.查全部
    @Override
    public List<Waybill> getAllWaybillByExample(WaybillExample waybillExample) {
        List<Waybill> waybillList=wmapper.getAllWaybillByExample(waybillExample);
        return waybillList;
    }

    //3.删除运单
    @Override
    public String deleteByPrimaryKey(String waybillId) {
        String s="no";
        int num = wmapper.deleteByPrimaryKey(waybillId);
            if(num>0){
                //删除成功
                s="ok";
            }
        return s;
    }

    //2.新增运单
    @Override
    public String insert(Waybill waybill) {
        String s="no";
        int num=wmapper.insert(waybill);
        if(num>0){
            //增加成功
           s="ok";
        }
        return s;
    }

    //4.更新运单
    @Override
    public String update(Waybill waybill) {
        String s="no";
        int num=wmapper.updateByPrimaryKey(waybill);
        if(num>0){
            //更新成功
            s="ok";
        }
        System.out.println(s);
        return s;
    }
}
