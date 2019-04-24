package main.java.animals;

public class Bird extends Animal {
  private String beak;

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    String breeds = " laying eggs";
    return breeds;
  }
}
