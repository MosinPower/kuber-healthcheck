package com.github.mosinpower.actuatorservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EchoController {

  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/echo")
  @ResponseBody
  public JustDto echo(@RequestParam(name="echo", required=false, defaultValue="nothing") String echo) {
    return new JustDto(counter.incrementAndGet(), echo);
  }

}