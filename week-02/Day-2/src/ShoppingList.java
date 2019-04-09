import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {
    List<String> shlist = new ArrayList<>(Arrays.asList
            ("eggs", "milk", "fish", "apples", "bread", "chicken" ));
    if (shlist.contains("milk")) {
      System.out.println("Milk is on the list");
    } else if (shlist.contains("bananas")) {
      System.out.println(shlist.contains("Bananas on the list"));
    }
  }
}
