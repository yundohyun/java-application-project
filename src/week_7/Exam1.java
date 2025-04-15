package week_7;

import javax.swing.*;
import java.awt.*;

public class Exam1 extends JFrame {
	public Exam1() {
		this.setTitle("Exam 1");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("아이스크림을 좋아하나요?");
		JButton yes = new JButton("Yes");
		JButton no = new JButton("No");
		
		yes.addActionListener(e -> label.setText("예, 아이스크림을 좋아합니다."));
		no.addActionListener(e -> label.setText("아니오, 아이스크림을 좋아하지 않습니다."));
		
		this.add(label);
		this.add(yes);
		this.add(no);
		
		this.setSize(400, 100);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam1();
	}
}