
public class Day04_EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7; // 초기화를 밖에서 해줌.
		
		while (num < 10) {
			System.out.println(num + "은(는) 10보다 작습니다.");
//			num = 100;
			num = num + 2;
		}
		System.out.println("while문이 끝나면 자연스럽게 다음 코드 찾아와요.");
	}

}
