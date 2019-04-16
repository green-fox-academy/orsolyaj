import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("new-file.txt");
      List<String> lines = Files.readAllLines(path);
      System.out.println(lines.size());
    } catch (Exception e) {
      System.out.println("no file");
    }
  }
}
