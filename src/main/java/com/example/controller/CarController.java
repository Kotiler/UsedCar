package com.example.controller;

import com.example.bean.Car;
import com.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController//@RestController是@ResponseBody和@Controller的组合注解。
public class CarController {
    @Autowired//@Autowired 注释，它可以对类成员变量、
    public CarService carService;

    @PostMapping("/showCar")//展示车辆的Post请求
    public List<Car> ShowCar(@RequestBody Car car){
        return carService.ShowCar(car);
    }
}
