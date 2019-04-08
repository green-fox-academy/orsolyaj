public class Summing {
  public static void main(String[] args) {
    int[] array = new int[5];
    System.out.println(sum(array));
  }

  public static int sum(int[] ar) {
    int sum = 0;
    for (int i = 0; i < ar.length; ++i) {
      sum += ar[i];
      // for (sum : ar
    }
    return sum;
  }
}
