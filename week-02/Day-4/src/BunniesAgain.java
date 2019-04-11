public class BunniesAgain {
  public static void main(String[] args) {
    int n = 3;
    System.out.println(ba(n));

  }

  public static int ba(int a) {
    int b;
    if (a % 2 == 0) {
       b = 3;
    } else {
       b = 2;
    }
    if (a == 0) {
      return 0;
    } else {
      return b + ba(a - 1);
    }
  }
}
