package com.haiwang.logistics.service.impl;

import com.haiwang.logistics.mapper.DispatchMapper;
import com.haiwang.logistics.pojo.Dispatch;
import com.haiwang.logistics.pojo.DispatchExample;
import com.haiwang.logistics.service.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/6/16
 * TIME:21:24
 */
@Service
public class DispatchServiceImpl implements DispatchService {
    @Autowired
    private DispatchMapper dispatchMapper;
    @Override
    public List<Dispatch> getDispatchAllByExample(DispatchExample example) {

        return dispatchMapper.getDispatchAllByExample(example);
    }
}
