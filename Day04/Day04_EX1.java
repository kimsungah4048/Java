
public class Day04_EX1 {

	public static void main(String[] args) {
		int num = 10;
		
		/* 
		 * num이 짝수이면, "짝수 입니다."
		 * num이 홀수이면, "홀수 입니다."
		 */
		
		/*
		 * 정답: 
		 * if (num % 2 == 0) { // 짝수 
			System.out.println("짝수 입니다.");
		} else { // 홀수 
			System.out.println("홀수 입니다.");
		 */
		if (num % 2 == 0) { // 짝수 
			System.out.println("짝수 입니다.");
		} else if ((num % 2) > 0) {
			System.out.println("홀수 입니다.");
		}
		
	}

}
