public class FindPartOfAnInteger {
  public static void main(String[] args) {
    int num = 1;
    int[] arr = {1, 11, 34, 52, 61};
    subInt(arr, num);
  }
  public static int[] subInt(int[] ar,int num) {
    int[] newa = [ar.length]

    for (int i = 0; 0 < ar.length; ++i) {
      if (ar[i] % 10 == num || ar[i] / 10 == num) {
        
        System.out.print(i + ", ");
      } else {
        System.out.print(" ");
      }
    }
    return  ;
}
}
