import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Logs {
  public static void main(String[] args) {
    String fileN = "newer-file.txt";
    IpAd(fileN);
    gP(fileN);
  }

  public static void IpAd(String fileN) {
    try {
      Path file = Paths.get(fileN);
      List<String> content = Files.readAllLines(file);
      List<String> Ip = new ArrayList<>();

      for (int i = 0; i < content.size(); i++) {
        for (String s : content) {
          String[] arr = s.split(" ");
          Ip.add(arr[8]);
        }
      }

      List<String> UnQIp = Ip.stream().distinct().collect(Collectors.toList());
      System.out.println(UnQIp);
    } catch (IOException e) {
      System.out.println("you fokd");
    }
  }

  public static void gP(String fileN) {
    try {
      Path file = Paths.get(fileN);
      List<String> content = Files.readAllLines(file);
      int g = 0;
      int P = 0;

      for (String s : content) {
        String[] arr = s.split(" ");
        if (arr[11].equals("GET")) {
          g++;
        } else {
          P++;
        }

      }
      System.out.println("GET/ POST ratio " + g + ": " + P);
    } catch (IOException e) {
    }
  }
}
