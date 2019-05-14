import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exc7 {
  public static void main(String[] args){
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    Map<Boolean, List<String>> map = cities.stream()
            .collect(Collectors.groupingBy(ch -> ch.startsWith("N")));
    System.out.println(map);

  }
}
