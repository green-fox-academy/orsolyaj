package main.java.animals;

public class Reptile extends Animal {
  private String bodycover;

  public Reptile(String name) {
    super(name);
  }

  @Override
  public String breed() {
    String breeds = " laying eggs";
    return breeds;
  }
}
