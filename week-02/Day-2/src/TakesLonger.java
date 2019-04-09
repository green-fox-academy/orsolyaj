public class TakesLonger {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, " +
            "even when you take into account Hofstadter's Law.";
    int i = quote.indexOf(" you");
    String missing = "always takes longer than";
    String news = quote.substring(0,i) + missing + quote.substring(i);
    System.out.println(news);

  }

}
