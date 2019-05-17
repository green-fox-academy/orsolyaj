package exc11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Exc11 {
  public static void main(String[] args) {
    try {
      Path filepath = Paths.get("feedGrain.txt");
      String wordString = Files.lines(filepath)
                .map(line -> line.toLowerCase())
                .collect(Collectors.joining(" "));
//      Map<String, Long> wordMap =
//              wordString.stream().collect(groupingBy(Function.identity(), counting()));
//        Map<String, Integer> wordMap = Files.lines(filepath)
//                .map(line -> line.toLowerCase())
//                .collect(Collectors.joining(" "))
//                .map(l -> l.split(" "))
//                .forEach(word -> word);

      Arrays.stream(new String(Files.readAllBytes(filepath), StandardCharsets.UTF_8).split("\\W+"))
              .collect(Collectors.groupingBy(Function.<String>identity(), HashMap::new, counting()))
              .entrySet()
              .stream()
              .sorted(((o1, o2) -> o2.getValue().compareTo(o1.getValue())))
              .limit(10)
              .forEach(System.out::println);

//       Files.lines(filepath)
//              .flatMap(line -> Arrays.stream(line.trim().split(" ")))
//              .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
//              .filter(word -> !word.isEmpty())
//              .collect(Collectors.groupingBy(Function.identity(), counting()));

    } catch (IOException exp) {
      exp.printStackTrace();

    }
  }
}
