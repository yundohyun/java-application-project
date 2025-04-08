package week_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class LoginEx extends JFrame {
  private final HashMap<String, String> user = new HashMap<>();

  public LoginEx() {
    this.setTitle("Login Form");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridLayout(3, 2));

    user.put("admin", "admin");
    user.put("user", "user");
    user.put("asdf", "asdf");

    JTextField id = new JTextField();
    JPasswordField password = new JPasswordField();

    JButton login = new JButton("로그인");
    login.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String id_text = id.getText();
        String password_text = new String(password.getPassword());
        System.out.printf("ID : %s, PW : %s\n", id_text, password_text);

        boolean email_exist = user.containsKey(id_text);
        boolean password_exist = password_text.equals(user.get(id_text));

        System.out.println(
          !email_exist || !password_exist
            ? "계정이 존재하지 않거나 비밀번호가 올바르지 않습니다."
            : "'" + id_text + "' 계정으로 로그인되었습니다!"
        );
      }
    });

    JButton cancel = new JButton("취소");
    cancel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        id.setText("");
        password.setText("");
//        System.exit(0);
      }
    });

    this.add(new JLabel("아이디"));
    this.add(id);
    this.add(new JLabel("비밀번호"));
    this.add(password);
    this.add(login);
    this.add(cancel);

    this.setSize(300, 150);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new LoginEx();
  }
}
