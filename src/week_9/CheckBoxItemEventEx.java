package week_9;

import javax.swing.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
  private final JCheckBox[] fruits = new JCheckBox[3];
  private final String[] fruitNames = {"사과", "배", "체리"};
  private final int[] fruitPrices = {1000, 2000, 1500};
  private int price = 0;
  
  public CheckBoxItemEventEx() {
    this.setTitle("체크박스와 ItemEvent 예제");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    
    JLabel sumLabel = new JLabel(String.format("현재 %d원 입니다.", this.price));
    
    for (int i = 0; i < fruitNames.length; i++) {
      fruits[i] = new JCheckBox(fruitNames[i]);
      fruits[i].setBorderPainted(true);
      this.add(fruits[i]);
      int idx = i;
      fruits[i].addItemListener(e -> {
        JCheckBox checkBox = (JCheckBox) e.getSource();
        if (checkBox.isSelected()) price += fruitPrices[idx];
        else price -= fruitPrices[idx];
        sumLabel.setText(String.format("현재 %d원 입니다.", this.price));
      });
    }
    
    this.add(sumLabel);
    
    this.setSize(250, 200);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new CheckBoxItemEventEx();
  }
}
