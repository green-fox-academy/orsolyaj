import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    String name = "Orsi";
    addN(name);
  }
  public static void addN(String a) {
    List<String> list = new ArrayList<>();
    list.add(a);
    try {
      Path file = Paths.get("new-file.txt");
      Files.write(file, list);
    } catch (Exception e) {
      System.out.println("Cant write file");
    }
  }
}
