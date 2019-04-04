public class CodingHours {
  public static void main(String[] args) {
    int dailyh = 6;
    int weekspan = 17;
    int workdays = 5;
    int average = 52;
    System.out.println("Percentage of coding hours is: " + ((dailyh * weekspan * workdays) / (average * weekspan) * 100));
  }
}
