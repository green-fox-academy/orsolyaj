package com.gfa.foxclub.controller;

import com.gfa.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/fox")
public class HomeController {
  private FoxService foxService;

  public HomeController(@Qualifier("foxService") FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  private String postName(String name) {
    foxService.addFox(name);
    return "redirect:/fox/home?name=" + name;
  }

  @GetMapping("/home")
  public String index(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/feed")
  public String feed(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "feed";
  }

  @GetMapping("/trick")
  public String train(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "trick";
  }
}
