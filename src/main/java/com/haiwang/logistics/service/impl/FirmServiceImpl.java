package com.haiwang.logistics.service.impl;

import com.haiwang.logistics.mapper.FirmMapper;
import com.haiwang.logistics.pojo.Firm;
import com.haiwang.logistics.pojo.FirmExample;
import com.haiwang.logistics.service.FirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirmServiceImpl implements FirmService {
    @Autowired
    private FirmMapper firmMapper;

    @Override
    public List<Firm> getFirmAllByExample(FirmExample firmExample) {
        return firmMapper.selectByExample(firmExample);
    }

    @Override
    public boolean saveFirm(Firm firm) {
        boolean b=false;
        int i =firmMapper.insert(firm);
        if (i>0){
            b=true;
        }
        return b;
    }

    @Override
    public boolean delFirmByFirmId(Integer firmId) {
        boolean b=false;
        int i =firmMapper.deleteByPrimaryKey(firmId);
        if (i>0){
            b=true;
        }
        return b;
    }

    @Override
    public boolean updateFirm(Firm firm) {
        boolean b=false;
        int i =firmMapper.updateByPrimaryKey(firm);
        if (i>0){
            b=true;
        }
        return b;
    }
}
