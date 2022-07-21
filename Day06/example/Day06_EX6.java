package example;

public class Day06_EX6 {

	public static void main(String[] args) {
		
		// 4 8 12 ... 96 총 24개의 4의 배수를 배열에 넣고, 배열 값을 출력
		
		int num[] = new int[24];
		for (int i = 1; i*4 <= 96; i++) {
			num[i-1] = i*4;
			System.out.println(num[i-1]);
		}
		
		int number[] = new int[20];
		for (int j = 1; j*5 <= 85; j++) {
			number[j-1] = j*5;
			System.out.println(number[j-1]);
		}
		
	}

}
