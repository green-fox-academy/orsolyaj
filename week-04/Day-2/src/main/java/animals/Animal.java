package main.java.animals;

public abstract class Animal {
  private String name;
  private int age;
  private String color;
  private String gender;

  public Animal(String name) {
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public abstract String breed();
}
