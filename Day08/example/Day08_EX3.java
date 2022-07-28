package example;

class Calc {
	private String brand;
	
	// Setter : brand 설정 - 보통 리턴값이 없어요.
	
	void Setbrand(String name) {
		brand = name;
	}
	
	// Getter : brand 값 가져다 줄 친구 - 보통 리턴값이 있어요. 
	String getBrand() {
		return brand; 
	}
	
	int minus (int a, int b) {
		return a-b;
	}
	int multiple (int a, int b) {
		return a*b;
	}
	
}

public class Day08_EX3 {

	public static void main(String[] args) {
		Calc math = new Calc();
		System.out.println(math.minus(5,2));
		System.out.println(math.multiple(9,3));
//		math.brand = "casio";
//		math.getBrand();
		math.Setbrand("카시오");
		System.out.println("계산기 브랜드는 " + math.getBrand() + "입니다.");
				
		

	}

}
