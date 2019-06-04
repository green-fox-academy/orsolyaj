package com.gfa.apisandrest.controller;

import com.gfa.apisandrest.service.DoublingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

  @GetMapping("/")
  public String renderIndex() {
    return "index";
  }
}
