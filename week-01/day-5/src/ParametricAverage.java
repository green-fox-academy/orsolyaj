import java.util.Scanner;
import java.util.Arrays;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Please enter a number of coming numbers: ");
    int num = Scanner.nextInt();

    int array[] = new int[num];

    {
      System.out.println("Enter a number: ");

      for (int i = 0; i < num; ++i) {
        array[i] = Scanner.nextInt();
      }

      int sum = 0;

      for (int a = 0; a < array.length; a++) {
        sum += a;
      }
      System.out.println("Sum of numbers is " + sum);

      int avg = sum / num;
      System.out.println("Average of numbers is " + avg);
    }
  }
}
