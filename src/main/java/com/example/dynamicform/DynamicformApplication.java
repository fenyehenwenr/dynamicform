package com.example.dynamicform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.example.dynamicform.mapper")
public class DynamicformApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicformApplication.class, args);
    }

}
