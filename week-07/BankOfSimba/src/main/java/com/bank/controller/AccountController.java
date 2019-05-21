package com.bank.controller;

import com.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {
  List<BankAccount> accountList;

  public AccountController() {
    accountList = new ArrayList<>();
    accountList.add(new BankAccount("Simba", 2000, "lion",true));
    accountList.add(new BankAccount("Nala", 2000, "lion",true));
    accountList.add(new BankAccount("Timon", 2000, "meerkat", true));
    accountList.add(new BankAccount("Pumba", 2000, "warthog", true));
    accountList.add(new BankAccount("Scar", 2000, "lion", false));
  }

  @GetMapping("/show")
  public String showAccounts (Model model) {

    model.addAttribute("accountList",accountList);
    return "index";
  }

  @PostMapping("/form")
  public String raiseMoney(int caracter) {
    accountList.get(caracter).raise();
    return "redirect:/show";
  }

  @GetMapping("/string")
  public String stringText(Model model) {
    model.addAttribute("string","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "string";
  }


}
