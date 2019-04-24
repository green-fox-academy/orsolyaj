package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    name = "Violin";
    setNumberOfStrings(4);
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    name = "Violin";
  }

  @Override
  public String sound() {
    String sounds = "Screech";
    return sounds;
  }
}

