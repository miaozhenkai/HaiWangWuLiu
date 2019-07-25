package com.haiwang.logistics.mapper;

import com.haiwang.logistics.pojo.Dispatch;
import com.haiwang.logistics.pojo.DispatchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DispatchMapper {
    int countByExample(DispatchExample example);

    int deleteByExample(DispatchExample example);

    int deleteByPrimaryKey(Integer dispatchId);

    int insert(Dispatch record);

    int insertSelective(Dispatch record);

    List<Dispatch> selectByExample(DispatchExample example);

    Dispatch selectByPrimaryKey(Integer dispatchId);

    int updateByExampleSelective(@Param("record") Dispatch record, @Param("example") DispatchExample example);

    int updateByExample(@Param("record") Dispatch record, @Param("example") DispatchExample example);

    int updateByPrimaryKeySelective(Dispatch record);

    int updateByPrimaryKey(Dispatch record);
    //多表联查
    List<Dispatch> getDispatchAllByExample(DispatchExample example);
}