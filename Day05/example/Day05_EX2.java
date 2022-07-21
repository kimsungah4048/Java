package example;

public class Day05_EX2 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i = i + 1) { // 1~4 : 4번 
			System.out.println("안녕하세요.");
			// i는 이 안에서만 움직여요.
		}
		
//		System.out.println(i); // i를 밖에서 쓸 수 없음. 
		
		// i = index -> j -> k ... 의미 없음. i 부터 순서대로.
		for (int j = 1; j <= 9; j = j + 1) {
			System.out.println(j);
		}
		
		for (int k = 9; k >= 1; k = k - 1) {
			System.out.println(k);
		}	
	}

}
