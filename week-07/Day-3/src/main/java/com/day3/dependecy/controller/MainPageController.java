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
    return "index";
  }


  @GetMapping("useful/email")
  public String email(@RequestParam String email, Model model) {
    if (utilityService.validateEmail(email)) {
      model.addAttribute("text", "valid");
      model.addAttribute("color", "color: green");
    } else {
      model.addAttribute("text", "invalid");
      model.addAttribute("color", "color: red");
    }
    return "valid";
  }

  @GetMapping("useful/caesar")
  public String coder(@RequestParam String text, @RequestParam int number, Model model) {
    text= utilityService.caesar(text,number);
    model.addAttribute("text", text);
    return "index";
  }
}
