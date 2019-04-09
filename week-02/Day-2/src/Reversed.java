public class Reversed {
  public static void main(String[] args) {
    String rev = ".eslaf eb t'ndluow ecnetnes siht ," +
            "dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    for (int i = rev.length() - 1; i >= 0; --i){
      System.out.print(rev.charAt(i));
    }
  }
}
