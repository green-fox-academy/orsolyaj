import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
  public static void mainDraw(Graphics graphics) {

    left(0, 320, 160, 320 - 277, graphics);
    right(320, 320, 160, 320 - 277, graphics);
    hor(0, 320, 320, 320, graphics);

  }

  public static int hor(int a, int b, int c, int d, Graphics g) {
    g.drawLine( a, b, c, d);
    if (a == c) {
      return 0;
    } else {
      return hor(a + 5, b - 10, c - 5, d - 10, g);
    }
  }
  public static int left(int a, int b, int c, int d, Graphics g) {
    g.drawLine(a, b, c, d);
    if (a == c) {
      return 0;
    } else {
      return left(a + 10, b, c + 5 , d + 10, g);
    }
  }
  public static int right(int a, int b, int c, int d, Graphics g) {
    g.drawLine(a, b, c, d);
    if (a == c) {
      return 0;
    } else {
      return right(a - 10, b, c - 5, d + 10, g);
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
