package week_3;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("윤도현", "양천구", "010-1234-5678", "20242785", "컴퓨터소프트웨어공학과");
		Student s2 = new Student("신지환", "서울", "010-1234-5679", "20249999", "컴퓨터소프트웨어공학과");
		
		s1.print();
		System.out.println();
		s2.print();
	}
}
