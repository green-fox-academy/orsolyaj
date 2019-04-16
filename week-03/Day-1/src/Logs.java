
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    Path file = Paths.get("newer-file.txt");
    try {
      List<String> content = Files.readAllLines(file);
      for (String s : content) {
        String[] arr = s.split(" ");
        List<String> Ip = new ArrayList<>();
        for (int i = 0; i < content.size(); i++) {
          Ip.add(i, arr[8]);
          System.out.println(Ip);
        }
      }
    } catch (IOException e) {
    }
  }
}
