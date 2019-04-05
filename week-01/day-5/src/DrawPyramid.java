public class DrawPyramid {
  public static void main(String[] args){
    int a = 4;
    for (int row = 0; row < a; ++row) {
      for (int sp = a; sp >= row; --sp) {
        System.out.print(" ");
      }
      for (int st = 0; st <= (row * 2); ++st){
        System.out.print("*");
      }
      System.out.println ();
    }

  }
}
