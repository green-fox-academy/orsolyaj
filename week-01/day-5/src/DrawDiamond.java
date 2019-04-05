public class DrawDiamond {
  public static void main(String[] args) {
    int a = 7;

    if (a % 2 != 0) {

      for (int row = 0; row <= a / 2; ++row) {
        for (int sp = a / 2; sp >= row; --sp) {
          System.out.print(" ");
        }
        for (int st = 0; st <= (row * 2); ++st) {
          System.out.print("*");
        }
        System.out.println();
      }

      for ( int row = a / 2; row > 0; --row) {
        for  (int sp = 2; sp < row; ++sp) {
          System.out.print(" ");
        }
        for (int st = a - 2 ; st > (row * 2); st--){
          System.out.print("*");
        }
      }

      } else {


        for (int row = 0; row < a / 2; ++row) {
          for (int sp = a / 2; sp >= row; --sp) {
            System.out.print(" ");
          }
          for (int st = 0; st <= (row * 2); ++st) {
            System.out.print("*");
          }
          System.out.println();
        }

        for (int row = 0; row < a / 2 ; ++row) {
          for (int sp = 0; sp <= row; ++sp) {
            System.out.print(" ");
          }
          for (int st = (a); st > (row * 2); --st) {
            System.out.print("*");
          }
          System.out.println();
        }
      }


  }
}
