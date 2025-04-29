package week_9;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
  public RadioButtonEx() {
    this.setTitle("라디오 버튼 만들기 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    
    ButtonGroup group = new ButtonGroup();
    JRadioButton btn1 = new JRadioButton("사과");
    JRadioButton btn2 = new JRadioButton("배", true);
    JRadioButton btn3 = new JRadioButton("체리", true);
    
    group.add(btn1);
    group.add(btn2);
    group.add(btn3);
    
    this.add(btn1);
    this.add(btn2);
    this.add(btn3);
    
    this.setSize(250, 150);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new RadioButtonEx();
  }
}
