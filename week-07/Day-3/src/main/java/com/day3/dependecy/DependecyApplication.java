package com.day3.dependecy;

import com.day3.dependecy.service.colorservices.MyColorable;
import com.day3.dependecy.service.colorservices.Printer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependecyApplication implements CommandLineRunner {
  private Printer printer;
  private MyColorable colorable;

  DependecyApplication(@Qualifier("red")  MyColorable colorable, Printer printer) {
    this.colorable= colorable;
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependecyApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("SUP");
    colorable.printcolor();
  }
}
