import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    System.out.println("Please enter 5 numbers");
    int[] integers = new int[5];
    for (int i = 0; i < 5; i++) {
      integers[i] = Scan.nextInt();
    }
    
  }
}
