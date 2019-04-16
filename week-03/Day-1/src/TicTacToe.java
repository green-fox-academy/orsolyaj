import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    String fileD = "draw.txt";
    String fileO = "win-o.txt";
    String fileX = "win-x.txt";
    match(fileO);
  }


  public static void match(String file) {
    try {
      Path fileP = Paths.get(file);
      List<String> row = Files.readAllLines(fileP);
      if (comparison('X', row)) {
        System.out.println("x");
      } else if (comparison('O', row)) {
        System.out.println("o");
      } else {
        System.out.println("draw");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static boolean comparison(char ch, List<String> row) {
    int c = 0;

    for (int i = 0; i < 3; i++) {
      if (row.get(i).charAt(0) == ch && row.get(i).charAt(1) == ch && row.get(i).charAt(2) == ch) {
        return true;
      } else if (row.get(0).charAt(i) == ch && row.get(1).charAt(i) == ch && row.get(2).charAt(i) == ch) {
        return true;
      } else if (row.get(i).charAt(2) == ch && row.get(i).charAt(1) == ch && row.get(i).charAt(0) == ch) {
        return true;
      } else if (row.get(i).charAt(i) == ch) {
        c++;
        if (c == 3) {
          return true;
        }
      }
    } return false;
  }

}
