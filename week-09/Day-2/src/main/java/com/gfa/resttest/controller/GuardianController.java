package com.gfa.resttest.controller;

import com.gfa.resttest.model.Arrow;
import com.gfa.resttest.model.ErrorModel;
import com.gfa.resttest.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> groot(@RequestParam(required = false) String message) {
    if (message != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Message(message));
    } else {
      return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorModel("I am Groot!"));
    }
  }

  @GetMapping("/yondu")
  public ResponseEntity<?> yondu(@RequestParam(required = false) Integer distance,@RequestParam(required = false) Integer time ) {
    if (time != null && distance != null && time != 0) {
      return ResponseEntity.status(HttpStatus.OK).body(new Arrow(distance, time));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorModel("Enter distance and time, time cant be 0"));
    }
  }
}
