import java.util.Scanner;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
  public static void mainDraw(Graphics graphics) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; ++i) {
      System.out.println("Enter parameters:");
      int par1 = sc.nextInt();
      int par2 = sc.nextInt();
      LineDraw(par1, par2, graphics);


    }
  }

  public static void LineDraw(int x, int y, Graphics graphics) {
      graphics.setColor(Color.BLACK);
      graphics.drawLine(x, y, x + 50, y);
    }


    // Create a line drawing function that takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a 50 long horizontal line from that point.
    // Draw 3 lines with that function. Use loop for that.
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
