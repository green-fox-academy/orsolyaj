public class NumberAdder {
  static int sum(int a) {
    if ( a == 1)
      return 1;
    else
      return (a + sum(a - 1));
  }
  public static void main(String[] args) {
    int i = 10;
    System.out.println(sum(i));
  }

}
