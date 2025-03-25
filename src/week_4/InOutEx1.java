package week_4;

import java.util.Scanner;

public class InOutEx1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇인가요? : ");
		String name = in.nextLine();
		
		System.out.print("당신은 몇살인가요? : ");
		int age = in.nextInt();
		
		System.out.printf("당신의 이름은 %s이고, 당신의 나이는 %d살입니다.%n", name, age);

		in.close();
		
	}
}
