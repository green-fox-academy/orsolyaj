public class Bmi {
  public static void main(String[] args) {
    double massInKg = 63;
    double heightInM = 2;
    double Bmi = massInKg / (heightInM * heightInM);

    System.out.println("BMI: " + Bmi);
  }
}
