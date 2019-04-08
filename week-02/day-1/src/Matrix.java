public class Matrix {
  public static void main(String[] args) {
    int[][] m = new int[4][4];
    for (int i = 0; i < m.length; ++i) {
      for (int j = 0; j< m[i].length; ++j) {
        if (i == j) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }System.out.print("\n");
    }
  }
}
