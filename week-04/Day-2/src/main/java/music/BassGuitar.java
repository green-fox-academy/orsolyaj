package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    name = "Bass Guitar";
    setNumberOfStrings(4);
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    name = "Bass Guitar";
  }

  @Override
  public String sound() {
    String sounds = "Dumm";
    return sounds;
  }
}
