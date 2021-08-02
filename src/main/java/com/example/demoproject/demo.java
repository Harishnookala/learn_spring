package com.example.demoproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

    @RequestMapping("/hello")
    public  String hello(){
        return "<h1>Hello World</h1>";
    }

    @RequestMapping("/welcome")
    public  String welcome(){
        return "<h1>Hello Guys</h1>";
    }
}
