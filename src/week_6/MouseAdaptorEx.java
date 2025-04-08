package week_6;

import javax.swing.*;
import java.awt.event.*;

public class MouseAdaptorEx extends JFrame {
  public MouseAdaptorEx() {
    this.setTitle("Mouse 이벤트 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);

    JLabel label = new JLabel("Hello");
    label.setSize(50, 20);
    label.setLocation(10, 10);
    this.add(label);

    this.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        label.setLocation(e.getX(), e.getY());
      }
    });

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new MouseAdaptorEx();
  }
}
