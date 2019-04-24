package main.java.music;

public class Violin extends StringedInstrument {
  static final String NAME = "Violin";

  public Violin() {
    super(NAME, 4);
  }

  public Violin(int numberOfStrings) {
    super(NAME, numberOfStrings);
  }

  @Override
  public String sound() {
    String sounds = "Screech";
    return sounds;
  }
}

