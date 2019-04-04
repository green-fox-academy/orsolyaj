import java.util.Scanner;


public class HelloUser {
  public static void main(String[] args) {
    System.out.println("Please enter your name ");
    Scanner scanner = new Scanner(System.in);
    String userInput1 = scanner.nextLine();
    System.out.println("Hello " + userInput1);
  }

}
