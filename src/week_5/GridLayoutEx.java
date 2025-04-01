package week_5;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		this.setTitle("Grid Layout Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new GridLayout(4, 2, 5, 5));
		this.add(new JLabel("이름"));
		this.add(new JTextField());
		this.add(new JLabel("학번"));
		this.add(new JTextField());
		this.add(new JLabel("학과"));
		this.add(new JTextField());
		this.add(new JLabel("과목"));
		this.add(new JTextField());
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GridLayoutEx frame = new GridLayoutEx();
	}
}
