package com.day3.dependecy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependecyApplication implements CommandLineRunner {
  private Printer printer;

  DependecyApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependecyApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("SUP");
  }
}
