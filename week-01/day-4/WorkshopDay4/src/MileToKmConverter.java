import java.util.Scanner;
public class MileToKmConverter {
  public static void main(String[] args) {
    System.out.println("Enter Mile: ");
    Scanner scanner = new Scanner(System.in);
    double mile = scanner.nextDouble();
    double KM = mile * 1.60934;
    System.out.println("In Km: " + KM);
  }
}
