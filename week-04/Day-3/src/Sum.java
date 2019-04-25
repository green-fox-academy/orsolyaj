import java.util.ArrayList;

public class Sum {

  public int summing(ArrayList<Integer> list) {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    return sum;
  }
}
