package example;

public class Day06_EX2 {
	
	public static void main(String[] args) {
		/*
		 * num1, num2, num3 정수형 변수 
		 */
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		int num [] = {10, 20, 30}; // 첫번 째 방법 : C언어와 동일 
		// int[] num = {10, 20, 30}; // 두번 째 방법 : 자바에만 적용 
		
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
		
		// 위에 꺼 for문으로.. 
		
		for (int i = 0; i < num.length; i++) {
							// sizeof(num)/sizeof(int) : C언어 
			System.out.println(num[i]);
		} 
	}

}
