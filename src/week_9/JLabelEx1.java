package week_9;

import javax.swing.*;
import java.awt.*;

public class JLabelEx1 extends JFrame {
  public JLabelEx1() {
    this.setTitle("레이블 이미지 예제");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    
    ImageIcon image = new ImageIcon("./src/week_9/assets/image.jpg");
    JLabel textLabel = new JLabel("Text Label");
    JLabel imageLabel = new JLabel(image);
    
    this.add(textLabel);
    this.add(imageLabel);
    
    this.setSize(440, 845);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new JLabelEx1();
  }
}
