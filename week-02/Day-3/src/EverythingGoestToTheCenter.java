import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingGoestToTheCenter {
  public static void mainDraw(Graphics graphics) {
    for ( int i = 0; i <= 320; i ++) {
      if ( i == 0 || i == 320) {
        for (int j = 0; j <= 320; j += 20) {
          lineD(i, j, graphics);
        }
        for (int k = 0; k <= 320; k += 20) {
          lineD(k , i, graphics);
        }
      }
    }
  }

  public static void lineD( int a, int b, Graphics graphics) {
    graphics.drawLine(a , b, WIDTH / 2, HEIGHT / 2);
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
