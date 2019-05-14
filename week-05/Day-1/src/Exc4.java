import java.util.Arrays;
import java.util.List;

public class Exc4 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n)
            .average()
            .ifPresent(avg -> System.out.println(avg));
  }
}
