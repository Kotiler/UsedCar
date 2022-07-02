package com.example.service;

import com.example.bean.Car;
import com.example.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@Service
public class CarService {
    @Autowired//@RequestBody
    CarDao carDao;
    public List<Car> ShowCar(Car car){//显示车辆 的信息
        return carDao.showCar(car);
    }
}
