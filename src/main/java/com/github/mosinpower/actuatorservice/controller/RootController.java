package com.github.mosinpower.actuatorservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String getRoot(){
        return "Just root of health-check application";
    }
}
