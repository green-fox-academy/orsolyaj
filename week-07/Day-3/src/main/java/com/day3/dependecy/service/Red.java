package com.day3.dependecy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class Red implements MyColorable {
  @Autowired
  Printer printer;

  @Override
  public void printcolor() {
    printer.log("It's Red");
  }
}
