package week_3;

import java.util.Scanner;

public class StrikeGame {
	public static void main(String[] args) {
		int[] answer = new int[3];
		int[] input = new int[3];
		for (int i = 0; i < 3; i++)
			answer[i] = (int)(Math.random() * 10);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Answer: " + answer[0] + " " + answer[1] + " " + answer[2]);
		
		while (true) {
			int strike = 0;
			
			System.out.print("Input 3 numbers: ");
			
			String[] inputs = in.nextLine().split(" ");
			for (int i = 0; i < 3; i++)
				input[i] = Integer.parseInt(inputs[i]);
			
			for (int i = 0; i < 3; i++) {
				boolean isStrike = false;
				boolean isBall = false;
				for (int j = 0; j < 3; j++)
					if (answer[j] == input[i])
						if (i == j) {
							strike++;
							isStrike = true;
						} else isBall = true;
				System.out.print(isStrike ? "Strike " : isBall ? "Ball " : "Out ");
			}
			
			System.out.println();
			
			if (strike == 3) break;
		}
	}
}
