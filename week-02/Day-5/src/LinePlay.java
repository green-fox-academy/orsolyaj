import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = HEIGHT;
    par(graphics, x1, y1, x2, y2);
    int a = 0;
    int b = 0;
    int c = WIDTH;
    int d = 0;
    par2(graphics, a, b, c, d);
  }

  public static int par(Graphics g, int x1, int y1, int x2, int y2) {
    g.drawLine(x1, y1, x2, y2);
    if (y1 == HEIGHT) {
      return 0;
    } else {
      return par(g, x1, y1 + HEIGHT / 16, x2 + WIDTH / 16, y2);
    }
  }

  public static int par2(Graphics g, int x1, int y1, int x2, int y2) {
    g.drawLine(x1, y1, x2, y2);
    if (x1 == WIDTH) {
      return 0;
    } else {
      return par2(g, x1 + WIDTH / 16, y1 , x2, y2  + HEIGHT / 16);
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

