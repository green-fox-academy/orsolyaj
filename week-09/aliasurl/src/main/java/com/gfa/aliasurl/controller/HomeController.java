package com.gfa.aliasurl.controller;

import com.gfa.aliasurl.model.AliasModel;
import com.gfa.aliasurl.service.AliasService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
  private AliasService aliasService;

  public HomeController(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/")
  public String renderHomePage(Model model) {
//    doesnt work when url should stay in form after alias error
//    model.addAttribute("aliasModel", new AliasModel());
    return "index";
  }

  @PostMapping("/save-link")
  public String saveLink(AliasModel aliasModel, RedirectAttributes redirectAttributes, Model model) {
    if (!aliasService.containsAlias(aliasModel.getAlias())) {
      aliasService.save(aliasModel);
      redirectAttributes.addFlashAttribute("text", "Your URL is aliased to " + aliasModel.getAlias()+ " and your magic number is " + aliasModel.getSecretCode());
      return "redirect:/";
    } else {
      String modelurl = aliasModel.getUrl();
      String modelalias = aliasModel.getAlias();
      redirectAttributes.addFlashAttribute("error", "Your Alias already exists");
      redirectAttributes.addFlashAttribute("aliasModelurl", modelurl);
      redirectAttributes.addFlashAttribute("aliasModelalias",modelalias);
      return "redirect:/";
    }
  }
}
