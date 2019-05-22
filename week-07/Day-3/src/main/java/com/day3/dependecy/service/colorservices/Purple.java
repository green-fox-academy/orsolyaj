package com.day3.dependecy.service.colorservices;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("purple")
public class Purple implements MyColorable {
  @Override
  public void printcolor() {
    System.out.println("It's Purple");
  }
}
