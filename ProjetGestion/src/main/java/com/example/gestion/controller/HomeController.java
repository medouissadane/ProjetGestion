package com.example.gestion.controller;

import com.example.gestion.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HomeService service;

    @RequestMapping("/ch1")
    public String callM1() {
        return service.m1();
    }
}