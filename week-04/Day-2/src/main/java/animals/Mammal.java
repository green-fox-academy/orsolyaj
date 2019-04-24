package main.java.animals;

public class Mammal extends Animal {
  private int legcount;

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String breed() {
    String breeds = " pushing miniature versions out";
    return breeds;
  }
}
