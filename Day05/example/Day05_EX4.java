package example;

public class Day05_EX4 {
	/*
	 * 구구단
	 * 2 X 1 = 2
	 * 2 X 2 = 4
	 * ...
	 * 2 X 9 = 18
	 * 
	 * 3 X 1 = 3
	 * ...
	 */

	public static void main(String[] arg) {
		System.out.println("구구단");
		for(int i = 2; i <= 9; i++) { // 2 ~ 9 까지
			for(int j = 1; j <= 9; j++) { // 1 ~ 9 까지 
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println(" ");
		}
	}
}
