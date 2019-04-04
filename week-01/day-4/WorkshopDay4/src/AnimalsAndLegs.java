import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter no. of chickens: ");
    int chicken = scanner.nextInt();
    System.out.println("Enter no. of pigs: ");
    int pigs = scanner.nextInt();

    int legs = pigs * 4 + chicken * 2;

    System.out.println("No of animal legs: " + legs);
  }
}
