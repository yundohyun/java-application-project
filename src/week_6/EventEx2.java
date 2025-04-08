package week_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventEx2 extends JFrame {
  public EventEx2() {
    this.setTitle("예제 4");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridLayout(3, 1));

    JLabel label = new JLabel("기본 텍스트");
    JButton btn1 = new JButton("안녕");
    JButton btn2 = new JButton("잘가");

    btn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("안녕하세요!");
      }
    });
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("안녕히 가세요!");
      }
    });

    this.add(label);
    this.add(btn1);
    this.add(btn2);

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new EventEx2();
  }
}
