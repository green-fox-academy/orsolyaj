import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Lines {
    public static void mainDraw(Graphics graphics) {
      // lines
      graphics.setColor(Color.red);
      graphics.drawLine(10, 120, 100, 120);
      graphics.setColor(Color.green);
      graphics.drawLine(10, 120, 10, 320);

      //multicolor box
      graphics.setColor(Color.red);
      graphics.drawLine(100, 10, 150, 10);
      graphics.setColor(Color.green);
      graphics.drawLine(150, 10, 150, 60);
      graphics.setColor(Color.black);
      graphics.drawLine(150, 60, 100, 60);
      graphics.setColor(Color.blue);
      graphics.drawLine(100, 60, 100, 10);

      //diagonals
      graphics.setColor(Color.green);
      graphics.drawLine(0, 0, 320, 320);
      graphics.setColor(Color.red);
      graphics.drawLine(0, 320, 320, 0);



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
