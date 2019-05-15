package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong idLong = new AtomicLong(0);

  @RequestMapping("greets")
  public Greeting greeting(@RequestParam String name) {
    Greeting greet = new Greeting(idLong.incrementAndGet(), "Hello " + name);
    return greet;
  }
}
