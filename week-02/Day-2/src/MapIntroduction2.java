import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("978-1-60309-452-8", "Letter to Jo");
    map.put("978-1-60309-459-7", "Lupus");
    map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    map.put("978-1-60309-461-0", "The Lab");

    map.forEach((k, v) -> System.out.println(v + " (ISBN: " + k + ")"));
    for (Map.Entry<String, String> entry : map.entrySet()) {
      String key = entry.getKey();
      String value = entry.getValue();
      System.out.println(value + " (ISBN: " + key + " )");
    }
    if (map.containsValue("The Lab")) {
      for (String key : map.keySet()) {
        if (map.get(key) == "The Lab") {
          map.remove(key);
        }
      }
    }
    System.out.println(map);
    map.put("978-1-60309-450-4", "They Called Us Enemy");
    map.put("978-1-60309-453-5", "Why Did We Trust Him?");
    map.containsKey("478-0-61159-424-8");
    System.out.println(map.get("978-1-60309-453-5"));
  }
}
