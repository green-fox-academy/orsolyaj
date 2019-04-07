public class DrawChessTable {
  public static void main(String[] args) {
    int n = 8;
    for (int r = 1; r <= n; r++ ) {
      for (int c = 1; c <= n; c++) {
        if ( r % 2 == 1  && c % 2 == 1 ) {
          System.out.print("%");
        } else if (r % 2 == 0  && c % 2 == 0) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
    }
  }

