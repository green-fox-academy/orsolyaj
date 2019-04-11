public class GreatestCommonDivider {
  public static void main(String[] args) {
    int a = 4446;
    int b = 432;
    if (a < b) {
      int temp = a;
      a = b;
      b = temp;
    }
    System.out.println(gcd(a, b));
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }
}



