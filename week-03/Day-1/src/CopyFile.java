import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    String fileName = "new-file.txt";
    copy(fileName);
  }

  public static void copy(String fileName) {
    Path file = Paths.get(fileName);
    try {
      List<String> content = Files.readAllLines(file);
      Path filePath = Paths.get("newer-file.txt");
      Files.write(filePath, content);
    } catch (IOException e) {
    }
  }
}
