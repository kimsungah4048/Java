package example;

class Jogger {
	int bottle; 
	
	void ride() {
		System.out.println("씽씽씽");
	}
	void bottleNum() {
		System.out.println("저는 " + bottle + " 개의 물통을 가지고 뜁니다.");
	}
}

public class Day08_EX1 {

	public static void main(String[] args) {
		Jogger player = new Jogger();
		
		player.bottle = 7;
		player.ride();
		player.ride();
		player.bottleNum();
	}

}
