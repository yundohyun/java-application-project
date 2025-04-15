package week_7;

import javax.swing.*;
import java.awt.*;

public class Exam2 extends JFrame {
	public Exam2() {
		this.setTitle("Exam 2");
		this.setLayout(new GridLayout(3, 2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField email = new JTextField();
		JPasswordField password = new JPasswordField();
		
		JButton login = new JButton("로그인");
		JButton cancel = new JButton("취소");
		
		login.addActionListener(e -> {
			String emailText = email.getText();
			String passwordText = new String(password.getPassword());
			System.out.printf("이메일: %s, 비밀번호: %s\n", emailText, passwordText);
			System.out.println(
				emailText.equals("hong@google.com") && passwordText.equals("1234")
					? "'" + emailText + "' 계정으로 로그인 성공"
					: "로그인 실패"
			);
		});
		cancel.addActionListener(e -> {
			email.setText("");
			password.setText("");
		});
		
		this.add(new JLabel("이메일"));
		this.add(email);
		this.add(new JLabel("비밀번호"));
		this.add(password);
		this.add(login);
		this.add(cancel);
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam2();
	}
}
