package week_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
  public IndepClassListener() {
    this.setTitle("Action 이벤트 리스너 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    JButton btn1 = new JButton("액션");
    btn1.addActionListener(new MyActionListener());
    this.add(btn1);

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new IndepClassListener();
  }
}

class MyActionListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    button.setText(button.getText().equals("액션") ? "Action" : "액션");
  }
}
