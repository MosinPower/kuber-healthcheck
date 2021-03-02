package com.github.mosinpower.actuatorservice.controller;

import com.github.mosinpower.actuatorservice.dto.HealthDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public HealthDto getHealth() {
        return new HealthDto("OK");
    }

}
