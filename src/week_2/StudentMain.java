package week_2;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("윤도현", 20242785, 21);
		Student s2 = new Student("신지환", 20242174, 21);
		System.out.println(s1.getName() + " " + s1.getStuId() + " " + s1.getAge());
		System.out.println(s2.getName() + " " + s2.getStuId() + " " + s2.getAge());
	}
}