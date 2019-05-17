import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exc3 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

    Map<Boolean, List<Integer>> greaterThan20 = numbers.stream()
            .collect(Collectors.groupingBy(n -> n*n > 20));
    System.out.println(greaterThan20);
  }
}
