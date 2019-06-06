package com.gfa.aliasurl.controller;

import com.gfa.aliasurl.service.AliasService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HitCountControler {
  private AliasService aliasService;

  public HitCountControler(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/a/{alias}")
  public Object findAlias(@PathVariable(required = false) String alias) {
    if (alias != null && aliasService.containsAlias(alias)) {
      aliasService.incrementHitcount(alias);
      return "redirect:" + aliasService.findByAlias(alias).getUrl();
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("404");
    }
  }
}
