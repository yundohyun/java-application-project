package week_9;

import javax.swing.*;
import java.awt.*;

public class JComEx1 extends JFrame {
  JComEx1() {
    this.setTitle("JComponent의 공통 메소드 예재");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel pn1 = new JPanel();
    JButton btn1 = new JButton("배경색과 바탕색 노랑색");
    JButton btn2 = new JButton("비활성화 버튼");
    JButton btn3 = new JButton("X, Y 좌표 구하기");
    
    btn1.setBackground(Color.YELLOW);
    btn1.setForeground(Color.MAGENTA);
    btn2.setEnabled(false);
    btn3.addActionListener(e -> {
      System.out.println(e);
      JButton btn = (JButton) e.getSource();
      System.out.printf("%d, %d\n", btn.getX(), btn.getY());
    });
    
    pn1.add(btn1);
    pn1.add(btn2);
    pn1.add(btn3);
    
    this.add(pn1);
    
    this.setSize(260,200);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new JComEx1();
  }
}