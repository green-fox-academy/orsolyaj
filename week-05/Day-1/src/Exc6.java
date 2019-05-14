import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exc6 {
  public static void main(String[] args) {
    String line = "Write a Stream Expression to find the uppercase characters in a string!";

    line.chars()
            .filter(ch -> Character.isUpperCase(ch))
            .mapToObj(i -> (char) i )
            .forEach(ch -> System.out.println(ch) );
  }
}
