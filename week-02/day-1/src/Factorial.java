public class Factorial {
  public static void main(String[] args) {
    double num = 5;
    System.out.println(factorio(num));

  }
  public static double factorio(double num) {
    double fact = 1;
    for (int i = 1; i <= num; ++i) {
      fact *= i;

    }
    return fact;
  }
}
