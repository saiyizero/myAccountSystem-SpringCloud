package com.virugan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class myConfigCenter {
    public static void main(String[] args) {
        SpringApplication.run(myConfigCenter.class, args);
    }
}
