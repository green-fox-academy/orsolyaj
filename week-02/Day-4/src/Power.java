public class Power {
  public static int powa(int a, int n) {
    if (n == 0) {
      return 1;
    } else {
      return a * powa(a, n - 1);
    }
  }

  public static void main(String[] args) {
    int a = 3;
    int b = 3;
    System.out.println(powa(a, b));
  }
}

