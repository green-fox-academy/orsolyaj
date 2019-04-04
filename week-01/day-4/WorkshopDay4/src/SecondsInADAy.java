public class SecondsInADAy {
  public static void main(String[] args) {
    int currentHours = 14;
    int currntMinutes = 34;
    int currentSeconds = 42;

    int currentTime = currentHours * 60 * 60 + currntMinutes * 60 + currentSeconds;
    int time = 60*60*24;
    int remainingTime = time - currentTime;

    System.out.println("Remaining seconds today: " + remainingTime);
  }
}
