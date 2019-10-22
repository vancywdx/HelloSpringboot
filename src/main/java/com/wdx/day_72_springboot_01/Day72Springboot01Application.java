package com.wdx.day_72_springboot_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wdx.day_72_springboot_01.mapper")
public class Day72Springboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(Day72Springboot01Application.class, args);
    }

}
