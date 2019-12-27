package com.virugan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.virugan.mapper")
public class asTranCenter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(asTranCenter.class, args);
    }
}