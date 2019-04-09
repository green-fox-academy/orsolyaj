import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
  public static void main(String[] args) {
    List<Integer> fin= new ArrayList<>
            (Arrays.asList(500, 1000, 1250, 175, 800, 120));
    int maxNum = fin.get(0);
    for (int i = 0; i <= fin.size() - 1; i++) {
      if (maxNum < fin.get(i)) {
        maxNum = fin.get(i);
      }
    }
    System.out.println(maxNum);

    int minNum = fin.get(0);
    for (int i = 0; i <= fin.size() - 1; i++) {
      if (minNum > fin.get(i)) {
        minNum = fin.get(i);
      }
    }
    System.out.println(minNum);

    int sum = 0;
    for (int i = 0; i < fin.size() - 1; ++i) {
      sum += fin.get(i);
    }
    System.out.println(sum);
  }
}
