public class DrawDiamond {
  public static void main(String[] args) {
    int a = 8;

    for (int row = 0; row <= a / 2; ++row) {
      for (int sp = a / 2; sp >= row; --sp) {
        System.out.print(" ");
      }
      for (int st = 0; st <= (row * 2); ++st) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int row = a / 2; row > 0; --row) {
      for (int sp = a / 2 + 1; sp >= row; --sp) {
        System.out.print(" ");
      }
      for (int st = 0; st < (row * 2) - 1; st++) {
        System.out.print("*");
      }
      System.out.println();
    }

    
  }
}


