package week_5;

import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		this.setTitle("첫 GUI 프로그래밍");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}