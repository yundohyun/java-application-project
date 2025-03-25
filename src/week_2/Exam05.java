package week_2;

public class Exam05 {
	static int var = 100;
	
	public static void main(String[] args) {
		int var = 0;
		System.out.println(var);
		
		int sum = addFunction(10, 20);
		
		System.out.println(sum);
	}
	
	static int addFunction(int a, int b) {
		return a + b + var;
	}
}