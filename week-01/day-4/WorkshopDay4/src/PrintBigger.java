import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int number1 = scanner.nextInt();
    System.out.println("Enter another number");
    int number2 = scanner.nextInt();

    if (number1 > number2) {
      System.out.println("The bigger no. is: " + number1);
    } else {
      System.out.println("The bigger no. is: " + number2);
    }
    }
  }
