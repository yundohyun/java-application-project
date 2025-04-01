package week_5;

import javax.swing.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		this.setTitle("Null Container Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null);
		
		JLabel label = new JLabel("Hello, Press Button!");
		label.setLocation(130, 50);
		label.setSize(200, 20);
		this.add(label);
		
		for (int i = 1; i < 10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setLocation(i * 15, i * 15);
			button.setSize(50, 20);
			this.add(button);
		}
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		NullContainerEx frame = new NullContainerEx();
	}
}
