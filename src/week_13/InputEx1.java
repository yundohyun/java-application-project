package week_13;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.sql.*;

public class InputEx1 extends JFrame {
    Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","dongyang");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    InputEx1() {
        this.setTitle("학생 관리 프로그램");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField tfId = new JTextField(20);
        JTextField tfName = new JTextField(20);
        JTextField tfDept = new JTextField(20);
        JTextField tfSearch = new JTextField(18);

        JTextArea ta = new JTextArea(15, 20);

        JRadioButton rbId = new JRadioButton("학번", true);
        JRadioButton rbName = new JRadioButton("이름");
        JRadioButton rbDept = new JRadioButton("학과");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbId);
        bg.add(rbName);
        bg.add(rbDept);

        JButton btnInsert = new JButton("입력");
        JButton btnUpdate = new JButton("수정");
        JButton btnDelete = new JButton("삭제");
        JButton btnSelect = new JButton("조회");
        JButton btnSearch = new JButton("검색");

        btnInsert.addActionListener(_ -> {
            try {
                Connection c = getConnection();
                PreparedStatement s = c.prepareStatement("insert into student(id, name, dept) values(?, ?, ?)");
                s.setString(1, tfId.getText());
                s.setString(2, tfName.getText());
                s.setString(3, tfDept.getText());
                s.executeUpdate();

                System.out.printf("%s 입력 완료\n", tfName.getText());

                tfName.setText("");
                tfDept.setText("");
                tfId.setText("");

                s.close();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        btnUpdate.addActionListener(_ -> {
            try {
                Connection c = getConnection();
                PreparedStatement s = c.prepareStatement("update student set name = ?, dept = ? where id = ?");
                s.setString(1, tfName.getText());
                s.setString(2, tfDept.getText());
                s.setString(3, tfId.getText());
                s.executeUpdate();

                System.out.printf("%s 수정 완료\n", tfName.getText());

                tfName.setText("");
                tfDept.setText("");
                tfId.setText("");

                s.close();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        btnDelete.addActionListener(_ -> {
            try {
                Connection c = getConnection();
                PreparedStatement s = c.prepareStatement("delete from student where id = ?");
                s.setString(1, tfId.getText());
                s.executeUpdate();

                System.out.printf("%s 삭제 완료\n", tfId.getText());

                tfName.setText("");
                tfDept.setText("");
                tfId.setText("");

                s.close();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        btnSelect.addActionListener(_ -> {
            try {
                Connection c = getConnection();
                PreparedStatement s = c.prepareStatement("select * from student");
                ResultSet r = s.executeQuery();

                StringBuilder content = new StringBuilder("id, name, dept");
                while (r.next())
                    content.append("\n")
                         .append(r.getString("id"))
                         .append(", ")
                         .append(r.getString("name"))
                         .append(", ")
                         .append(r.getString("dept"));
                ta.setText(content.toString());
                System.out.println(content);

                r.close();
                s.close();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        btnSearch.addActionListener(_ -> {
            try {
                Connection c = getConnection();
                PreparedStatement s = c.prepareStatement(
                     "select * from student where " + (rbId.isSelected() ? "id" : rbName.isSelected() ? "name" : "dept") + " = ?"
                );
                s.setString(1, tfSearch.getText());
                ResultSet r = s.executeQuery();

                StringBuilder content = new StringBuilder("id, name, dept");
                while (r.next())
                    content.append("\n")
                         .append(r.getString("id"))
                         .append(", ")
                         .append(r.getString("name"))
                         .append(", ")
                         .append(r.getString("dept"));
                ta.setText(content.toString());
                System.out.println(content);

                tfSearch.setText("");

                r.close();
                s.close();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        this.add(new JLabel("학번"));
        this.add(tfId);
        this.add(new JLabel("이름"));
        this.add(tfName);
        this.add(new JLabel("학과"));
        this.add(tfDept);

        this.add(btnInsert);
        this.add(btnUpdate);
        this.add(btnDelete);
        this.add(btnSelect);

        JPanel pn1 = new JPanel();
        pn1.add(new JLabel(" "));
        pn1.add(tfSearch);
        pn1.add(btnSearch);

        JPanel pn2 = new JPanel();
        pn2.add(rbId);
        pn2.add(rbName);
        pn2.add(rbDept);

        JPanel pm = new JPanel(new BorderLayout(0, 0));
        pm.add(BorderLayout.NORTH, pn1);
        pm.add(BorderLayout.CENTER, pn2);
        pm.setBorder(new TitledBorder("검색"));

        this.add(pm);
        this.add(ta);

        this.setSize(300, 550);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new InputEx1();
    }
}
