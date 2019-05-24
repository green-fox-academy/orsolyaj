package com.gfa.foxclub.controller;

import com.gfa.foxclub.service.FoodService;
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
public class FoxController {
  private FoxService foxService;
  FoodService foodService;

  public FoxController(@Qualifier("foxService") FoxService foxService, @Qualifier("food") FoodService foodService) {
    this.foxService = foxService;
    this.foodService = foodService;
  }

  @GetMapping("/feed")
  public String feed(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("foxes",foxService.foxByName(name));
    model.addAttribute("foodlist",foodService.getFoodList());
    model.addAttribute("drinklist",foodService.getDrinkList());
    return "feed";
  }

  @PostMapping("/feed")
  public String food(@RequestParam String name, String eat, String drink) {
    foxService.foxByName(name).setEat(eat);
    foxService.foxByName(name).setDrink(drink);
    return "redirect:/fox/home?name=" + name;
  }
}
