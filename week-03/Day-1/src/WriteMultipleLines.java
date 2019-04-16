import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String path = "new-file.txt";
    String w = "Word";
    Integer i = 4;
    lines(path, w, i);
  }

  public static void lines(String a, String b, Integer i) {
    try {
      Path fpath = Paths.get(a);
      List<String> string = new ArrayList<>();
      for (int j = 0; j < i; j++) {
        string.add(b);
      }  Files.write(fpath, string);
    } catch (Exception e) {

    }
  }
}

