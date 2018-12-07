package com.kfr.youkuang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.kfr.youkuang.mapper") // mybatis扫描路径，针对的是接口Mapper类
public class DbApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);
    }
}