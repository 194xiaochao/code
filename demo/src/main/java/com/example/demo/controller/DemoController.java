package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/get")
    public String getStr() {
        return "获取成功";
    }

    @GetMapping("/getAll")
    public String getStrs() {
        return "获取所有getall数据";
    }

}
