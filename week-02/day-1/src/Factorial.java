public class Factorial {
  public static void main(String[] args) {
    double[] factorial = new double[10];
    System.out.println(factorio(factorial));

  }
  public static double factorio(double[] num) {
    double fact = 1;
    for (int i = 1; i < num.length; ++i) {
      fact *= num[i];

    }
    return fact;
  }
}
