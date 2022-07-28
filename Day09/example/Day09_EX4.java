package example;

/*
 * 클래스 Pen
 * 브랜드 문자열 필드 
 * 펜의 개수    필드 num
 */
class Pen {
	Pen(String b, int n){ // 객체 생성하는 거 말고, 할일이 딱히 없을 때 -> 생략 가능 
		brand = b;
		num = n;
	}
		private String brand; // 펜의 브랜드
	
		private int num; // 펜의 개수
	
		
		// brand Getter 
		String getBrand(){
			return brand;
		}
		
		// brand Setter 
		void setBrand(String b) {
			brand = b;
		}
		
		// num Getter 
		int getNum (){
			return num;
		}
		
		// num Setter
		void setNum (int n) {
			num = n;
		}
		
}

public class Day09_EX4 {

	public static void main(String[] args) {
		Pen monami = new Pen("모나미",3);
		//출력 : 모나미 펜이 3자루 있습니다. 
		System.out.println("저는 " + monami.getBrand() + " 브랜드의 펜이 " + monami.getNum() + "자루 있습니다.");
	
	}

}
