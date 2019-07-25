package com.haiwang.logistics.service.impl;

import com.haiwang.logistics.mapper.CarMapper;
import com.haiwang.logistics.pojo.Car;
import com.haiwang.logistics.pojo.CarExample;
import com.haiwang.logistics.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 邓浩楠
 * @Description
 * @projectName HaiWangWuLiu
 * @date2019/6/16 19:13
 */
@Service
public class CarServiceImpl implements CarService {
    //让spring注入mapper对象
    @Autowired
    private CarMapper cmapper;

    @Override
    public List<Car> getCarAllByExample(CarExample carExample) {
        return cmapper.selectByExample(carExample);
    }

    @Override
    public boolean saveCar(Car car) {
        boolean b = false;
        int i = cmapper.insert(car);
        if(i>0){
            b=true;
        }
        return b;
    }

    @Override
    public boolean deleteCarByCarNum(String carNum) {
        boolean b = false;
        int i = cmapper.deleteByPrimaryKey(carNum);
        if(i>0){
            b=true;
        }
        return b;
    }

    @Override
    public boolean updateCar(Car car) {
        boolean b = false;
        int i = cmapper.updateByPrimaryKey(car);
        if(i>0){
            b=true;
        }
        return b;
    }
}
