import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Please enter 1st no.: ");
    int fir = Scanner.nextInt();

    System.out.println("Please enter 2nd no.: ");
    int sec = Scanner.nextInt();

    System.out.println("Please enter 3rd no.: ");
    int thi = Scanner.nextInt();

    System.out.println("Please enter 4th no.: ");
    int fou = Scanner.nextInt();

    System.out.println("Please enter 5th no.: ");
    int fif = Scanner.nextInt();

    int sum = fir + sec + thi + fou + fif;
    int avr = sum / 5;

    System.out.println("Sum of numbers: " + sum + "  Averageof numbers: " + avr );
  }

}
