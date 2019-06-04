package com.gfa.apisandrest.model;

public class Greeting {
  private String name;
  private String title;
  private String greet;

  public Greeting(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public String getGreet() {
    return greet;
  }

  public void setGreet(String greet) {
    this.greet = greet;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
