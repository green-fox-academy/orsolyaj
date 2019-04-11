public class Strings {
  public static void main(String[] args) {
    String str = "Im a string with few xxxx in it";
    char x = 'x';
    char y = 'y';
    int n = str.length();
  }
  public static String str(String a, int n, char x, char y) {
    if ( n == 0) {
      return a;
    }
      else {
        if (a.charAt(n) == x ) {
          return str().replace(x, y);
        } else {
          return str();
        }

    }
  }

}
