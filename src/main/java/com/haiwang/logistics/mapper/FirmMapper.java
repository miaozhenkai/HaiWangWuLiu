package com.haiwang.logistics.mapper;

import com.haiwang.logistics.pojo.Firm;
import com.haiwang.logistics.pojo.FirmExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FirmMapper {
    int countByExample(FirmExample example);

    int deleteByExample(FirmExample example);

    int deleteByPrimaryKey(Integer firmId);

    int insert(Firm record);

    int insertSelective(Firm record);

    List<Firm> selectByExample(FirmExample example);

    Firm selectByPrimaryKey(Integer firmId);

    int updateByExampleSelective(@Param("record") Firm record, @Param("example") FirmExample example);

    int updateByExample(@Param("record") Firm record, @Param("example") FirmExample example);

    int updateByPrimaryKeySelective(Firm record);

    int updateByPrimaryKey(Firm record);
}