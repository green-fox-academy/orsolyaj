package com.gfa.foxclub.controller;

import com.gfa.foxclub.service.FoodService;
import com.gfa.foxclub.service.FoxService;
import com.gfa.foxclub.service.TrickService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/fox")
public class TrickController {
  private TrickService trickService;
  private FoxService foxService;

  public TrickController(@Qualifier("trick") TrickService trickService, @Qualifier("foxService") FoxService foxService) {
    this.trickService = trickService;
    this.foxService = foxService;
  }

  @GetMapping("/trick")
  public String train(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("tricklist", trickService.getTrickList());
    return "trick";
  }

  @PostMapping("/trick")
  public String food(@RequestParam String name, String trick, Model model) {
    if (foxService.foxByName(name).getTrickList().contains(trick) == false) {
      foxService.foxByName(name).getTrickList().add(trick);
      return "redirect:/fox/home?name=" + name;
    } else
      model.addAttribute("knowntrick", "Already knows it");
    return "trick";
  }
}
