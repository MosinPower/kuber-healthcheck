package com.github.mosinpower.actuatorservice.controller;

import com.github.mosinpower.actuatorservice.dto.JustDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EchoController {

  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/echo")
  @ResponseBody
  public JustDto echo(@RequestParam(name="echo", required=false, defaultValue="nothing") String echo) {
    return new JustDto(counter.incrementAndGet(), echo);
  }

}