package com.haiwang.logistics.service;

import com.haiwang.logistics.pojo.Firm;
import com.haiwang.logistics.pojo.FirmExample;

import java.util.List;

public interface FirmService {
    //查所有
    public List<Firm> getFirmAllByExample(FirmExample firmExample);

    //增加
    public boolean saveFirm(Firm firm);

    //删除
    public boolean delFirmByFirmId(Integer firmId);

    //更新
    public boolean updateFirm(Firm firm);
}
