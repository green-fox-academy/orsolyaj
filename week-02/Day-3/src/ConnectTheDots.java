import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
      List<Integer> x = new ArrayList<>(Arrays.asList(10, 290, 290, 10));
      List<Integer> y = new ArrayList<>(Arrays.asList(10, 10, 290, 290));
      for (int i = 0; i < x.size() - 1; i++) {
        graphics.drawLine(x.get(i), y.get(i), x.get(i + 1), y.get(i + 1));
      }
      List<Integer> a = new ArrayList<>(Arrays.asList(50, 70, 80, 90, 100, 120, 85, 50));
      List<Integer> b = new ArrayList<>(Arrays.asList(100, 70, 90, 90, 70, 100, 130, 100));
      for (int i = 0; i < a.size() - 1; i++) {
        graphics.drawLine(a.get(i), b.get(i), a.get(i + 1), b.get(i + 1));
      }
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
