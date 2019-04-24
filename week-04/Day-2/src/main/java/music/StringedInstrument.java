package main.java.music;

public class StringedInstrument extends Instrument {
  private int numberOfStrings;

  public StringedInstrument() {
    numberOfStrings = 4;
  }

  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "- stringed instrument that goes " + sound());
  }

  public String sound() {
    String sounds = "beep";
    return sounds;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }
}
