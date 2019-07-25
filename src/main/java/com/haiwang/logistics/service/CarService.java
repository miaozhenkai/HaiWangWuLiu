package com.haiwang.logistics.service;

import com.haiwang.logistics.pojo.Car;
import com.haiwang.logistics.pojo.CarExample;

import java.util.List;

/**
 * @author 邓浩楠
 * @Description
 * @projectName HaiWangWuLiu
 * @date2019/6/16 19:12
 */
public interface CarService {
    //查所有
    public List<Car> getCarAllByExample(CarExample carExample);

    //增加
    public boolean saveCar(Car car);

    //删除
    public boolean deleteCarByCarNum(String carNum);

    //更新
    public boolean updateCar(Car car);


}
