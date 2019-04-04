import java.util.Scanner;

public class Cuboid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please specify the cube side lenght");
    int userInput1 = scanner.nextInt ();

    int Volume = userInput1 * userInput1 * userInput1;
    int Surface = userInput1 * userInput1 * 6;

    System.out.println( "Volume: " + Volume);
    System.out.println( "Surface area: " + Surface);

  }
}
