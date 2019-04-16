import java.util.HashMap;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String, Integer> dat= new HashMap<>();
    dat.put("eggs", 200);
    dat.put("milk", 200);
    dat.put("fish", 400);
    dat.put("Apples", 150);
    dat.put("Bread", 50);
    dat.put("Chicken", 550);
    System.out.println(dat.get("fish"));


    for (int i = 0; i < dat.size() - 1; i++) {

    }

  }
}
