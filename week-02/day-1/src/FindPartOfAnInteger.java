public class FindPartOfAnInteger {
  public static void main(String[] args) {
    int num = 1;
    int[] arr = {1, 11, 34, 52, 61};
    subInt(arr, num);
  }
  public static int[] subInt(int[] ar,int num) {
    int[] newa = new int[ar.length];
    for (int i = 0; 0 < ar.length; ++i) {
      if (ar[i] % 10 == num || ar[i] / 10 == num || ar[i] == num) {
        for (int j = 0; j < i; j++) {
          newa[j] = ar[i];
          System.out.print(ar[i]);
        }
      } else {
        System.out.print("[  ]");
      }
    }
    return newa;
}
}
