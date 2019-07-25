package com.haiwang.logistics.service;

import com.github.pagehelper.PageInfo;
import com.haiwang.logistics.pojo.Waybill;
import com.haiwang.logistics.pojo.WaybillExample;

import java.util.List;

public interface WaybillService {
    //1.查所有
    public List<Waybill> getAllWaybillByExample(WaybillExample waybillExample);

    //3.删除运单
    public String deleteByPrimaryKey(String waybillId);

    //2.增加运单
    public String insert(Waybill waybill);

    //4.更新运单
    public String update(Waybill waybill);

}
