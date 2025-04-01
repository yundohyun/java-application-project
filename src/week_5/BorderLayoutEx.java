package week_5;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		this.setTitle("Border Layout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		this.setLayout(new BorderLayout(FlowLayout.LEFT, 30, 20));
		
		this.add(new JButton("Add"), BorderLayout.NORTH);
		this.add(new JButton("Sub"), BorderLayout.SOUTH);
		this.add(new JButton("Mul"), BorderLayout.EAST);
		this.add(new JButton("Div"), BorderLayout.WEST);
		this.add(new JButton("Calculate"), BorderLayout.CENTER);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderLayoutEx frame = new BorderLayoutEx();
	}
}
