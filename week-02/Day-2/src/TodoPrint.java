import java.util.ArrayList;
import java.util.List;
public class TodoPrint {
  public static void main(String[] args) {
    List <String>  todo = new ArrayList<>() ;
    todo.add("- Buy Milk\n");
    todo.add(0, "My todo: \n");
    todo.add("- Download games\n");
    todo.add("\t-Diablo");

    System.out.println(todo);
  }
}
