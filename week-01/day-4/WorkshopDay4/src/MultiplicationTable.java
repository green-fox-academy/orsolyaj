import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter no.: ");
    int num= scanner.nextInt();

    for (int i = 1; i<= 10; i++) {
      int t = i * num;
      System.out.println(i + " * " + num + " = " + t);
    }
  }
}
