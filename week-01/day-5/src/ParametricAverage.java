import java.util.Scanner;
import java.util.Arrays;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Please enter a number of coming numbers: ");
    int num = Scanner.nextInt();

    int inp[] = new int[num];

    {
      System.out.println("Enter a number: ");

      for (int i = 0; i < num; ++i) {
        inp[i] = Scanner.nextInt();
      }
    }
  }
}
