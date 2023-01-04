package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

public class testApplication {
    public static void main(String[] args) {
        SpringApplication.run(testApplication.class, args);
    }
    @RequestMapping("/test")

}
