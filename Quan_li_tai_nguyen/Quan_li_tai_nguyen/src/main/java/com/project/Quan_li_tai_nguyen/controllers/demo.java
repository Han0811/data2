package com.project.Quan_li_tai_nguyen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demo {
    @GetMapping("/1")
    public String demo1(){
        return "demo1";
    }
}
