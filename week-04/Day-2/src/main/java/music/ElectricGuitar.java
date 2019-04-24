package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar() {
    setNumberOfStrings(6);
    name = "Electric Guitar";
  }

  public ElectricGuitar(int numberOfStrings) {
    super (numberOfStrings);
    name = "Electric Guitar";
  }
  @Override
  public String sound() {
    String sounds = "Twang";
    return sounds;
  }
}
