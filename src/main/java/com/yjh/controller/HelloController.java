package com.yjh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Jkenis!!";
    }

    @RequestMapping("/hello2")
    public String hellow2(){
        return "Hello Jkenis test2!!";
    }
}
