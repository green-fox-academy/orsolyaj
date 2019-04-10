import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
  public static void mainDraw(Graphics graphics) {
    int a = 320;
    List<Color> unicorn = new ArrayList<>(Arrays.asList
            (Color.yellow, Color.orange, Color.red, Color.pink, Color.blue, Color.blue, Color.red));

    int color = 0;
    for (int i = 0; i < 10; i++) {

      if (color == unicorn.size()) {
        color = 0;
      }
      sqDr(a - (i * 32), graphics, unicorn.get(color));
      ++color;
    }
  }

  public static void sqDr(int a, Graphics graphics, Color c) {
    graphics.setColor(c);
    graphics.fillRect(WIDTH / 2 - a / 2, HEIGHT / 2 - a / 2, a, a);
  }
  
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }

}