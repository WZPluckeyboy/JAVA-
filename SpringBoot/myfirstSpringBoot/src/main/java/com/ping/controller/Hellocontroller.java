package com.ping.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hellocontroller {
    @ResponseBody
@RequestMapping
    public String SayHello(){
    return "hello world";
    }
}
/* http://localhost:8080/hello*/