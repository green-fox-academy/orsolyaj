import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("my-file.txt");
      List<String> l = Files.readAllLines(path);
      System.out.println(l);
    } catch (Exception e) {
      System.out.println("No file");
    }
  }
}
