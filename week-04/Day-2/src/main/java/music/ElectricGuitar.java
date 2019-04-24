package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  static final String NAME = "Electric guitar";

  public ElectricGuitar() {
    super(NAME, 6);
  }

  public ElectricGuitar(int numberOfStrings) {
    super(NAME, numberOfStrings);
  }

  @Override
  public String sound() {
    String sounds = "Twang";
    return sounds;
  }
}
