package com.example.dao;


import com.example.bean.Car;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface CarDao {
    //展示车辆接口
    public List<Car> showCar(Car car);
}
