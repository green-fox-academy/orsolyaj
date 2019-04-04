import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter no. of girls");
    int numberg = scanner.nextInt();
    System.out.println("Enter no. of boys");
    int numberb = scanner.nextInt();
    int peeps = numberg + numberb;

    if (numberg == numberb && peeps >= 20) {
      System.out.println("The party is excellent");
    }
    if (numberg != numberb && peeps >= 20 && numberg != 0) {
      System.out.println("Quite cool party");
    }
    if (peeps < 20 && numberg != 0) {
      System.out.println("Average party...");
    }
    if (numberg == 0) {
      System.out.println("Sausage party");
    }
  }
}
