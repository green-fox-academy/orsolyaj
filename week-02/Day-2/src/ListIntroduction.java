import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIntroduction {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    System.out.println(list.size());
    list.add("William");
    System.out.println(list.isEmpty());
    list.add("John");
    list.add("Amanda");
    System.out.println(list.size());
    System.out.println(list.get(2));
    for (String name : list) {
      System.out.println(name);
    }
    Iterator<String> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
    }
    list.remove(2);
    System.out.println(list);

    for (String name : list) {
      System.out.println(name);
    }

    for (int i = list.size() - 1; i >= 0; --i) {
      System.out.println(list.get(i));
    }

    list.clear();
    System.out.println(list);


  }
}
