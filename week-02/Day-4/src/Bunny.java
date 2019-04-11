public class Bunny {
  public static int bunny(int n) {
    int a = 2;
    if (n == 0) {
      return 0;
    } else {
      return a + bunny( n - 1);
    }
  }
  public static void main(String[] args) {
    int n = 6;
    System.out.println(bunny(n));

  }

}
