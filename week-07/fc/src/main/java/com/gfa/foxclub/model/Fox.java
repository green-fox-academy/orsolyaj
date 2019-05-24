package com.gfa.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private String eat;
  private String drink;
  private List<String> trickList;

  public Fox(String name) {
    this.name = name;
    eat = "pasta";
    drink = "water";
    this.trickList = new ArrayList<>();
  }

  public void addTrick(String trick) {
    this.trickList.add(trick);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEat() {
    return eat;
  }

  public void setEat(String eat) {
    this.eat = eat;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<String> trickList) {
    this.trickList = trickList;
  }
}
