package exc10;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
  public static void main(String[] args) {

    Fox fox1 = new Fox("fox1", "green", 6);
    Fox fox2 = new Fox("fox2", "green", 5);
    Fox fox3 = new Fox("fox3", "green", 3);
    Fox fox4 = new Fox("fox4", "blue", 10);
    Fox fox5 = new Fox();
    Fox fox6 = new Fox();

    List<Fox> foxList = Arrays.asList(fox1, fox2, fox3, fox4, fox5, fox6);

    sorting(foxList, "green", 5);
    System.out.println(colorGroup(foxList));

//    foxList.stream()
//            .filter(f -> f.getAge() < 5)
//            .filter(f -> f.getColor().equals("green"))
//              .collect(Collectors.groupingBy((f -> f.getColor().equals("green"))));
//            .forEach(f -> System.out.println(f.getName()));

//    System.out.println(foxList.stream()
//            .collect(Collectors.groupingBy(f -> f.getColor(),
//                    Collectors.mapping(fox -> fox.getName(), Collectors.toSet()))));
//    System.out.println(goupedColorFoxes);
  }

  public static void sorting(List<Fox> listOfFoxes, String color, Integer age) {
    listOfFoxes.stream()
            .filter(f -> f.getAge() < age)
            .filter(f -> f.getColor().equals(color))
            .forEach(f -> System.out.println(f.getName()));
  }


  public static Map<String, List<String>> colorGroup(List<Fox> listOfFoxes) {
    Map<String, List<String>> foxy =
            listOfFoxes.stream()
                    .collect(groupingBy(Fox::getColor, mapping(Fox::getName, Collectors.toList())));
    return foxy;
  }
}
