package com.ping;

import com.ping.controller.Hellocontroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
@SpringBootConfiguration
public class MybootApplication {
    public static void main(String[] args) {
        SpringApplication.run(Hellocontroller.class, args);
    }
}
