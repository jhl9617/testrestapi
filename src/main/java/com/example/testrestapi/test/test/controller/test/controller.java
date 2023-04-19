package com.example.testrestapi.test.test.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
    @PostMapping("test")
    public String testMethod(){
        return "test";
    }
}
