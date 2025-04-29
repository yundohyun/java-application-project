package week_9;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
  private boolean on = true;
  
  public ButtonEx() {
    this.setTitle("이미지 버튼 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    
    ImageIcon mic = new ImageIcon("./src/week_9/assets/mic.png");
    ImageIcon micPressed = new ImageIcon("./src/week_9/assets/mic_pressed.png");
    ImageIcon micOff = new ImageIcon("./src/week_9/assets/mic_off.png");
    ImageIcon micOffPressed = new ImageIcon("./src/week_9/assets/mic_off_pressed.png");
    
    JButton btn = new JButton(String.format("Press to Turn %s", this.on ? "Off" : "On"), mic);
    btn.setPressedIcon(micPressed);
    btn.addActionListener(e -> {
      JButton actionBtn = (JButton) e.getSource();
      this.on = !this.on;
      actionBtn.setText(String.format("Press to Turn %s", this.on ? "Off" : "On"));
      actionBtn.setIcon(this.on ? mic : micOff);
      actionBtn.setPressedIcon(this.on ? micPressed : micOffPressed);
    });
    
    this.add(btn);
    
    this.setSize(250, 150);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new ButtonEx();
  }
}
