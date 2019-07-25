package com.haiwang.logistics.mapper;

import com.haiwang.logistics.pojo.Waybill;
import com.haiwang.logistics.pojo.WaybillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaybillMapper {
    int countByExample(WaybillExample example);

    int deleteByExample(WaybillExample example);

    int deleteByPrimaryKey(String waybillId);

    int insert(Waybill record);

    int insertSelective(Waybill record);
    //cha
    List<Waybill> selectByExample(WaybillExample example);

    Waybill selectByPrimaryKey(String waybillId);

    int updateByExampleSelective(@Param("record") Waybill record, @Param("example") WaybillExample example);

    int updateByExample(@Param("record") Waybill record, @Param("example") WaybillExample example);

    int updateByPrimaryKeySelective(Waybill record);

    int updateByPrimaryKey(Waybill record);

    //1.查所有运单（两表）
    public List<Waybill> getAllWaybillByExample(WaybillExample waybillExample);

}