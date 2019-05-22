package com.day3.dependecy.controller;

import com.day3.dependecy.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainPageController {

  @Autowired
  @Qualifier("utilityService")
  private UtilityService utilityService;

  @GetMapping("/useful")
  public String homepage() {
    return "index";
  }


  @GetMapping("/useful/colored")
  public String background(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return"index";
  }


  @GetMapping("useful/email")
  public String email(@RequestParam String email) {
    if (utilityService.validateEmail(email)) {
      return "valid";
    } else
      return "index";
  }
}
