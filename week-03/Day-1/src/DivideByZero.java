
public class DivideByZero {
  public static void main(String[] args) {
    int a = 0;
    div0(a);
  }

  public static void div0(int a) {
    try {
      int res = 10 / a;
      System.out.println(res);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
    }
  }

