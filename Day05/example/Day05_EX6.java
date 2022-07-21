package example;

public class Day05_EX6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 18;
		System.out.println(num); // 18
		System.out.println(num++); // 18로 출력 --> 19로 바뀜 (다음 num을 만날 때 까지)
		System.out.println(--num); // 위 19에서 내려와서 1 먼저 빼고 18로 출력 
		System.out.println(num-- + " " + ++num); // 18로 출력 --> 17로 바뀌고 1 먼저 더해지고 + 17 = 18
	}

}
