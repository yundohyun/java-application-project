package week_9;

import javax.swing.*;
import java.awt.*;

public class JTextAreaEx extends JFrame {
  public JTextAreaEx() {
    this.setTitle("Text Area 이벤트");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    
    JTextField tf = new JTextField(20);
    JTextArea ta = new JTextArea(7, 20);
    
    this.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
    this.add(tf);
    this.add(ta);
    
    tf.addActionListener(e -> {
      ta.append(tf.getText() + "\n");
      tf.setText("");
    });
    
    this.setSize(300, 300);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new JTextAreaEx();
  }
}
