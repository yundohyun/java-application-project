package week_5;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		this.setTitle("Flow Layout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		this.add(new JButton("Add"));
		this.add(new JButton("Sub"));
		this.add(new JButton("Mul"));
		this.add(new JButton("Div"));
		this.add(new JButton("Calculate"));
		
		this.setSize(350, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		FlowLayoutEx frame = new FlowLayoutEx();
	}
}
