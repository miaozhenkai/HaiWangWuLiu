package com.haiwang.logistics.mapper;

import com.haiwang.logistics.pojo.Staff;
import com.haiwang.logistics.pojo.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    //登录
    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Integer staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    //多表联查
    List<Staff> getStaffAllByExample(StaffExample example);


    List<Staff> getStaff1(String departmentName, String firmName);


}