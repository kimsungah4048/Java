package example;

/*
 * 
 */
class SoccerPlayer {
	int age; 
	
	void hello() {
		// 메소드는 필드를 이용할 수도 있다. 
		System.out.println("안녕하세요");
		System.out.println("저는 손흥민이구요, " + age + "살 입니다.");
	}
	void play() {
		System.out.println("출전합니다.");
	}
}

public class Day07_EX3 {
	public static void main(String[] args) {
		SoccerPlayer son = new SoccerPlayer();
		son.age = 30;
		
		son.hello(); // 안녕하세요 출력

		son.play(); // 출전합니다. 

	}

}
