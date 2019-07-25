package com.haiwang.logistics.service;

import com.haiwang.logistics.pojo.Dispatch;
import com.haiwang.logistics.pojo.DispatchExample;

import java.util.List;

/**
 * Created with:IntelliJ IDEA
 * USER:wangyue
 * DATE:2019/6/16
 * TIME:21:22
 */
public interface DispatchService {
    public List<Dispatch> getDispatchAllByExample(DispatchExample example);
}
