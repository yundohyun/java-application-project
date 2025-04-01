package week_5;

import javax.swing.*;
import java.awt.*;

public class Ex9_2 extends JFrame {
	Ex9_2() {
		this.setTitle("버튼 3개 화면");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		this.add(new JButton("OK"));
		this.add(new JButton("Cancel"));
		this.add(new JButton("Delete"));
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex9_2 frame = new Ex9_2();
	}
}