package example;

public class Day06_EX5 {

	public static void main(String[] args) {
		
		// arr = array
		// 3, 6, 9 ... 99 총 33개의 3의 배수를 배열에 넣어볼게요.
		int num[] = new int[33];
					// new : 새로운 거 생성
					// int형 상자 33칸
					// 새로운 것 생성 ; int 모양의 ; 33칸 
					// 0~33
		
		// 3 6 9 12 15 18 21 ... 99
		// 1 2 3 4 5 6 7 ... 33 * 3
		for (int i = 1; i*3 < 100; i++) {
			num[i-1] = i*3; 
			System.out.println(num[i-1]);
//			num[0] = 3; // i가 1일 때, 3이고 싶어요.
//			num[1] = 6; // i가 2일 때, 6이고 싶어요.
			
			// i - 1 :: 배열번호 
			// i * 3 :: 
		
		// 3 6 9 12 15 18 21 ... 99
		// 3 +3 ~ i < 100
/*		for (int i = 3; i < 100; i = i + 3) {
			System.out.println(i);
*/			
		}
	}

}
