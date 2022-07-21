
public class Day02_EX4 {

	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 300; 
		int temp;
		
		temp = 200; 
		n1 = n1+temp;
		n2 = n2-temp;
		
		/* 다른 방법
		 * temp = n1; // temp가 n1의 값을 기억하고 있을 것임.
		 * n1 = n2; // n1 == 300;
		 * n2 = temp; // n2 == temp == n1 == 100;
		 */
		
		
		System.out.println(n1); // 300
		System.out.println(n2); // 100

	}

}
