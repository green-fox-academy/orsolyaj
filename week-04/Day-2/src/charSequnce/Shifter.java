package charSequnce;

public class Shifter implements CharSequence{
  private String string;
  private int shift;

  public Shifter(String string, int shift) {
    this.string = string;
    this.shift = shift;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index + shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
