import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    int x = WIDTH / 2;
    int y = HEIGHT / 2;
    int a = 10;
    int b = 20;
    for (int i = 0; i < 3; i += 1) {
      for (int j = 0; j < 50; j += 20) {
        graphics.drawLine(a + j, b, x, y);
      }
    }
  }

// Don't touch the code below
      static int WIDTH = 640;
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


