package week_9;

import javax.swing.*;
import java.awt.*;

public class JListEx extends JFrame {
  public JListEx() {
    this.setTitle("JList 예제");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    
    String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
    JList<String> strList = new JList<>(fruits);
    this.add(strList);
    
    strList.addListSelectionListener(e -> {
      if (e.getValueIsAdjusting()) return;
      System.out.println(strList.getSelectedValue());
    });
    
    this.setSize(300, 300);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new JListEx();
  }
}
