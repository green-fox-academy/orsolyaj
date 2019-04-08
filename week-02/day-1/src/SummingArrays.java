public class SummingArrays {
  public static void main(String[] args) {
    int[] array = {1,2,3};
    System.out.println(sum(array));
  }

  public static int sum(int[] ar) {
    int sum = 0;
    for (int i = 0; i < ar.length; ++i) {
      sum += ar[i];

    }
    return sum;
  }
}
