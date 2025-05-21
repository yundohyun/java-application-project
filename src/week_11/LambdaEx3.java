package week_11;

import javax.swing.*;
import java.awt.*;

public class LambdaEx3 extends JFrame {
    LambdaEx3() {
        this.setTitle("Lambda Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JLabel label = new JLabel("아이스크림을 좋아하나요?");
        JButton yes = new JButton("Yes");
        JButton no = new JButton("No");

        yes.addActionListener(_ -> label.setText("아이스크림을 좋아하는군요!"));
        no.addActionListener(_ -> label.setText("아이스크림을 좋아하지 않는군요..."));

        this.add(label);
        this.add(yes);
        this.add(no);

        this.setSize(400, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LambdaEx3();
    }
}
