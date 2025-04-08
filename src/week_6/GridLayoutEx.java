package week_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutEx extends JFrame {
  public GridLayoutEx() {
    this.setTitle("GridLayout Sample");
    this.setLayout(new GridLayout(5, 2));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField name = new JTextField();
    JTextField stu_id = new JTextField();
    JTextField major = new JTextField();
    JTextField cls = new JTextField();

    JButton ok = new JButton("확인");
    JButton cancel = new JButton("취소");

    ok.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.printf("이름 : %s, 학번 : %s, 학과 : %s, 과목 : %s\n", name.getText(), stu_id.getText(), major.getText(), cls.getText());
      }
    });
    cancel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        name.setText("");
        stu_id.setText("");
        major.setText("");
        cls.setText("");
      }
    });

    this.add(new JLabel("이름"));
    this.add(name);
    this.add(new JLabel("학번"));
    this.add(stu_id);
    this.add(new JLabel("학과"));
    this.add(major);
    this.add(new JLabel("과목"));
    this.add(cls);
    this.add(ok);
    this.add(cancel);

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new GridLayoutEx();
  }
}