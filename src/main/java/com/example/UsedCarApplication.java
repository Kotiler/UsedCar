package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example")//对包下所有的接口进行实现
@SpringBootApplication//@SpringBootApplication  : 是Sprnig Boot项目的核心注解，目的是开启自动配置
public class UsedCarApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsedCarApplication.class, args);
    }
}
