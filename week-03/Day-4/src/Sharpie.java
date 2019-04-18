public class Sharpie {
  String color;
  float widh;
  float inkAmount;

  public Sharpie() {
    inkAmount = 100.0F;
  }

  public void use() {
    inkAmount--;
  }
}
