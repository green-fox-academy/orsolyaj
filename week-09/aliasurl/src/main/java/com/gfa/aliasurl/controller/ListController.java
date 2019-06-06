package com.gfa.aliasurl.controller;

import com.gfa.aliasurl.model.AliasModel;
import com.gfa.aliasurl.model.SecretCode;
import com.gfa.aliasurl.repository.IAliasRepository;
import com.gfa.aliasurl.service.AliasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ListController {
  private AliasService aliasService;

  public ListController(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/api/links")
  public List<AliasModel> findAllApis() {
    return aliasService.findAll();
  }

  @PostMapping("/api/list/{id}")
  ResponseEntity<?> findSecretCodeByAliasId(@PathVariable Long id, @RequestBody SecretCode secretCode) {
    if (aliasService.containsId(id) && aliasService.findById(id).getSecretCode() == secretCode.getSecretCode()) {
      aliasService.delete(id);
      return ResponseEntity.status(HttpStatus.OK).body("204");
    } else if (aliasService.containsId(id) && aliasService.findById(id).getSecretCode() != secretCode.getSecretCode()){
      return ResponseEntity.status(HttpStatus.FORBIDDEN).body("403");
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("404");
    }
  }
}
