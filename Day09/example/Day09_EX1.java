package example;

class Cat { // 생성자가 객체를 생성하는 거 빼고 
			// 딱히 할일이 없을 때 생략되어 있음.
	
	private String name; // 이름을 저장할 수 있는 필드 (이름 필드) 
	
	Cat(String n) { // 특별한 메소드 "생성자" 
			// 객체 초기화 & 필드에 첫 값을 넣어줄 수 있어요. (필드도 초기화 해줄 수 있어요.)
			// 필드의 원하는 값을 넣어서 객체를 초기화 할 수 있어요. 
		name = n;
//		name = "코끼리";
	} // 객체를 생성하면서 객체를 초기화 해줌. 
	
	// Getter
	String getName() {
		return name;
	}
	
	// Setter
	void setName(String n) {
		name = n;
	}
	
}

public class Day09_EX1 {
	
	// 컴퓨터 접근하는 메소드 
	// 프로그램의 시작
	public static void main(String[] args) {
		// public : private 정반대 
		// static : ??? 
		// void : 리턴값이 없다는 것. 
		// main : 메소드 이름 
		// String[] args : 매개변수 
		
		Cat nabi = new Cat("나비");
		System.out.println("제 고양이 이름은 " + nabi.getName() + "입니다.");
		
//		nabi.setName("나비");
//		System.out.println("제 고양이 이름은 " + nabi.getName() + "입니다.");
	}

}
