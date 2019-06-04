package com.gfa.apisandrest.controller;

import com.gfa.apisandrest.model.ErrorModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ServiceErrorAdvice {



  @ExceptionHandler( {NullPointerException.class})
  public String handleNullPointerException(NullPointerException e) {
    return "Error input is null!";
  }
}
