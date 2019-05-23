package com.gfa.foxclub.model;

public class Fox {
  private String name;
  private int tricks;
  private String eat;
  private String drink;

  public Fox(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTricks() {
    return tricks;
  }

  public void setTricks(int tricks) {
    this.tricks = tricks;
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
}
