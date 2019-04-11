public class Sumdigit {
  public static int sumDigit(int a) {
    if ( a / 10 == 0)
      return a % 10;
    else
      return a % 10 + sumDigit( a / 10);
  }
  public static void main(String[] args) {
    int x = 126;
    System.out.println(sumDigit(x));

  }
}
