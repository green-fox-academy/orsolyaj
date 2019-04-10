import java.util.Scanner;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquarePositioning {
  public static void mainDraw(Graphics graphics) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.println("Please enter x and y:");
      int x = sc.nextInt();
      int y = sc.nextInt();
      SqDraw(x, y, graphics);
    }
  }

  public static void SqDraw(int a, int b, Graphics graphics) {
    graphics.drawRect(a, b, 50, 50);
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

