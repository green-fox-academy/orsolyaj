package main.java.music;

public class BassGuitar extends StringedInstrument {
  static final String NAME = "Bass Guitar";

  public BassGuitar() {
    super(NAME, 4);
  }

  public BassGuitar(int numberOfStrings) {
    super(NAME, numberOfStrings);
  }

  @Override
  public String sound() {
    String sounds = "Dumm";
    return sounds;
  }
}
