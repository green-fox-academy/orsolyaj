import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Exc9 {
  public static void main(String[] args) {

    String frequency = "Write a Stream Expression to find the frequency of characters in a given string!";
    Map<Character, Integer> freq = frequency.chars().boxed()
            .collect(toMap(
                    k -> Character.valueOf((char) k.intValue()),
                    v -> 1,
                    Integer::sum
                    )
            );
    System.out.println(freq);
  }
}
