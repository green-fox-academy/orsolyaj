import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {
  public static void mainDraw(Graphics graphics) {
      for (int j = 0; j < 4; ++j) {
        for (int k = 0; k < 20; k += 5) {
          graphics.setColor(new Color(6 + k, 130 + k, 130 + k));

          graphics.drawRect(10, 10, 50 - j, 50 - j);
        }
      }
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main (String[]args){
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