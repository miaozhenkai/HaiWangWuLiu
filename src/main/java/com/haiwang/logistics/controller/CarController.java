package com.haiwang.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiwang.logistics.pojo.Car;
import com.haiwang.logistics.pojo.CarExample;
import com.haiwang.logistics.service.CarService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 邓浩楠
 * @Description
 * @projectName HaiWangWuLiu
 * @date2019/6/16 20:06
 */
@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @ResponseBody
    @RequestMapping("/carList")
    public String showCarList(int page, int limit, String carNum, String carType, Integer carLoad) {
        System.out.println(11);
        //多条件分页查询
        CarExample carExample = new CarExample();
        carExample.setOrderByClause("car_num");
        String carNumLike = "%" + carNum + "%";
        String carTypeLike = "%" + carType + "%";
        if (carNum != null && carType == null && carLoad == null) {
            carExample.createCriteria().andCarNumLike(carNumLike);
        }
        if (carNum == null && carType != null && carLoad == null) {
            carExample.createCriteria().andCarTypeLike(carTypeLike);
        }
        if (carNum != null && carType != null && carLoad == null) {
            carExample.createCriteria().andCarNumLike(carNumLike).andCarTypeLike(carTypeLike);
        }
        if (carLoad != null && carNum == null && carType == null) {
            carExample.createCriteria().andCarLoadEqualTo(carLoad);
        }
        if (carLoad != null && carNum != null && carType == null) {
            carExample.createCriteria().andCarLoadEqualTo(carLoad).andCarNumLike(carNumLike);
        }
        if (carLoad != null && carNum == null && carType != null) {
            carExample.createCriteria().andCarLoadEqualTo(carLoad).andCarTypeLike(carTypeLike);
        }
        if (carLoad != null && carNum != null && carType != null) {
            carExample.createCriteria().andCarLoadEqualTo(carLoad).andCarNumLike(carNumLike).andCarTypeLike(carTypeLike);
        }
        PageHelper.startPage(page, limit);
        List<Car> carList = carService.getCarAllByExample(carExample);
        PageInfo<Car> pageInfo = new PageInfo<Car>(carList);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0");
        jsonObject.put("msg", "");
        jsonObject.put("count", pageInfo.getTotal());
        jsonObject.put("data", pageInfo.getList());
        return jsonObject.toString();
    }

    @ResponseBody
    @RequestMapping("/addCar")
    public String addCar(@RequestBody Car car) {
        String s;
        boolean b = carService.saveCar(car);
        if (b) {
            s = "添加成功";
        }
        else {
            s = "添加失败";
        }
        return s;
    }

    @ResponseBody
    @RequestMapping("/delCar")
    public String delStaff(String carNum){
        String s;
        boolean b=carService.deleteCarByCarNum(carNum);
        if(b){
            s = "删除成功";
        }
        else {
            s = "删除失败";
        }
        return s;
    }

    @ResponseBody
    @RequestMapping("/updateCar")
    public String updateStaff(@RequestBody Car car){
        String s;
        boolean b=carService.updateCar(car);
        if(b){
            s = "修改成功";
        }
        else {
            s = "修改失败";
        }
        return s;
    }
}
