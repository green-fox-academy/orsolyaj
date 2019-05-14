import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exc8 {
  public static void main(String[] args) {
    List<Character> charList = Arrays.asList('L', 'o', 'n', 'd', 'o', 'n');

    String word = charList.stream()
            .map(ch -> String.valueOf(ch))
            .collect(Collectors.joining());
    System.out.println(word);
  }
}
