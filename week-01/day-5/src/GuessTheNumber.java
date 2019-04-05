import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int guess = 8;
    int imp;
    do {
      System.out.println("Please enter guess no.: ");
      imp = sc.nextInt();
    if (imp < 8) {
      System.out.println("more");
    } else if ( imp > 8) {
      System.out.println("less");
    }
    } while (imp != guess );
    System.out.println("its 8 !");
    }
  }

