
public class Day03_EX5 {

	public static void main(String[] args) {
		
		int a = 10 / 4; // int 는 정수만 되기 때문에 소숫점을 버려버린다. --> 2.5X, 2
		System.out.println (a); // 2
		
		double b = 10 / 4; // int / int
							//소숫점이 아니기 때문에 (정수 나누기 정수) 2.0이 나온다. 계산을 하자마자 소숫점을 버림. 
							// 2 --> 2.0
		System.out.println(b);
		
		double c = 10.0 / 4.0; // double / double = 2.5
		System.out.println(c);
		
		/*** 나머지 연산 : int의 연산에만 적용 (%) ***/
		int d = 30 / 9; // 3
		System.out.println(d);
		int e = 30 % 9; // 3
		System.out.println(e);
		System.out.println(10%2);
	}

}
