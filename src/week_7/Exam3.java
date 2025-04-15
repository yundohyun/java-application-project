package week_7;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Exam3 extends JFrame {
	ArrayList<Student> students = new ArrayList<>(List.of(
		new Student("1", "1", "1", "1"),
		new Student("2", "2", "2", "2"),
		new Student("3", "3", "3", "3"),
		new Student("4", "4", "4", "4"),
		new Student("5", "5", "5", "5")
	));
	
	public Exam3() {
		this.setTitle("Exam 3");
		this.setLayout(new GridLayout(6, 2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField stuName = new JTextField();
		JTextField stuId = new JTextField();
		JTextField stuDept = new JTextField();
		JTextField stuClass = new JTextField();
		
		JButton ok = new JButton("확인");
		JButton cancel = new JButton("취소");
		JButton findAndSave = new JButton("조회 및 파일 저장");
		JButton findByName = new JButton("이름으로 검색");
		
		ok.addActionListener(e -> {
			Student student = new Student(
				stuName.getText(),
				stuId.getText(),
				stuDept.getText(),
				stuClass.getText()
			);
			students.add(student);
			
			stuName.setText("");
			stuId.setText("");
			stuDept.setText("");
			stuClass.setText("");
			
			System.out.println("추가된 학생 정보: " + student);
		});
		
		cancel.addActionListener(e -> {
			stuName.setText("");
			stuId.setText("");
			stuDept.setText("");
			stuClass.setText("");
		});
		
		findAndSave.addActionListener(e -> {
			StringBuilder content = new StringBuilder();
			for (Student student : students) {
				if (!content.isEmpty()) content.append("\n");
				content.append(student);
			}
			
			System.out.println("학생 정보\n" + content);
			
      File loc = new File("./src/week_7/assets/student.txt");
			try {
        FileOutputStream fw = new FileOutputStream(loc);
        BufferedOutputStream bw = new BufferedOutputStream(fw);
				bw.write(content.toString().getBytes());
        bw.close();
        fw.close();
				System.out.printf("%s에 학생 정보를 저장하였습니다.%n", loc.getPath());
			} catch (IOException err) {
        err.printStackTrace();
        System.out.println("I/O Error");
      }
		});
		
		findByName.addActionListener(e -> {
			for (Student student : students)
				if (student.getName().equals(stuName.getText()))
					System.out.println("학생 정보: " + student);
			stuName.setText("");
		});
		
		this.add(new JLabel("이름"));
		this.add(stuName);
		this.add(new JLabel("학번"));
		this.add(stuId);
		this.add(new JLabel("학과"));
		this.add(stuDept);
		this.add(new JLabel("과목"));
		this.add(stuClass);
		this.add(ok);
		this.add(cancel);
		this.add(findAndSave);
		this.add(findByName);
		
		this.setSize(300, 250);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam3();
	}
}
