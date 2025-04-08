package week_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventEx1 extends JFrame {
  public EventEx1() {
    this.setTitle("Event Example 1");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLayout(new FlowLayout());

    JButton btn1 = new JButton("확인");
    JButton btn2 = new JButton("취소");

    ActionListener event = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        System.out.printf("%s 버튼을 눌렀습니다.\n", button.getText());
      }
    };

    btn1.addActionListener(event);
    btn2.addActionListener(event);

    this.add(btn1);
    this.add(btn2);

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new EventEx1();
  }
}
