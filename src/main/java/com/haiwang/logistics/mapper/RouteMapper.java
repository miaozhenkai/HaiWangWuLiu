package com.haiwang.logistics.mapper;

import com.haiwang.logistics.pojo.Route;
import com.haiwang.logistics.pojo.RouteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RouteMapper {
    int countByExample(RouteExample example);

    int deleteByExample(RouteExample example);

    int deleteByPrimaryKey(Integer routeId);

    int insert(Route record);

    int insertSelective(Route record);

    List<Route> selectByExample(RouteExample example);

    Route selectByPrimaryKey(Integer routeId);

    int updateByExampleSelective(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByExample(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKey(Route record);
}