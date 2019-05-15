package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloLanguages {
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  String[] colors = {"yellowgreen", "mediumaquamarine", "sandybrown", "palegreen", "slateblue", "rebeccapurple"};


  @RequestMapping("/web/languages")
  public String languages(Model model, @RequestParam String name) {
    int number = (int) (10 + Math.random()*10);
    String newestColor = colors[(int) (Math.random() * colors.length)];
    String language = hellos[(int) (Math.random() * hellos.length)];
    model.addAttribute("name", name);
    model.addAttribute("language", language);
    model.addAttribute("color", newestColor);
    model.addAttribute("number",number);
    return "languages";
  }
}

