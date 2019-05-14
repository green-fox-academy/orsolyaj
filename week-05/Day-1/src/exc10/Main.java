package exc10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    Fox fox1 = new Fox("green", 6);
    Fox fox2 = new Fox("green", 5);
    Fox fox3 = new Fox("green", 3);
    Fox fox4 = new Fox("blue", 10);
    Fox fox5 = new Fox();
    Fox fox6 = new Fox();

    List<Fox> foxList = Arrays.asList(fox1, fox2, fox3, fox4, fox5, fox6);

    foxList.stream()
            .filter(f -> f.getAge() < 5)
            .filter(f -> f.getColor().equals("green"))
//            .collect(Collectors.groupingBy((f -> f.getColor().equals("green"))));
            .forEach(f -> System.out.println(f));

    System.out.println(foxList.stream()
            .collect(Collectors.groupingBy(f -> f.getColor(),
                    Collectors.mapping(fox -> fox.getName(), Collectors.toSet()))));
//    System.out.println(goupedColorFoxes);
  }
}
