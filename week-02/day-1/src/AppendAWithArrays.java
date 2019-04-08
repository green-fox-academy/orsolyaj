public class AppendAWithArrays {
  public static void main(String[] args) {
    String[] animals = {"koal", "pand", "zebr" };

    for (int i = 0; i < animals.length; ++i) {
      appendAFunc(animals[i]);
    }
  }
  public static void appendAFunc (String s)
  {
    System.out.println(s + "a");
  }
}
