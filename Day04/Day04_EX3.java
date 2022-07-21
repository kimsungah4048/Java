
public class Day04_EX3 {

	public static void main(String[] args) {
		/**
		 * 노래방 선곡 번호 
		 * 1111: 땡벌을 선곡하셨습니다.
		 * 2222: ____
		 * 3333: ____
		 * 4444: ____
		 * 
		 * 아직 등록되지 않은 번호입니다.
		 */
		
		int num = 7777;
		
		switch (num) {
			case 1111: // if (num == 1111)
				System.out.println("땡벌을 선곡하셨습니다.");
				break;
			case 2222: // else if (num == 2222)
				System.out.println("LET IT GO를 선곡하셨습니다.");
				break;
			case 3333: 
				System.out.println("THERAPIST를 선곡하셨습니다.");
				break;
			case 4444: 
				System.out.println("TOMBOY를 선곡하셨습니다.");
				break;
			default: // else 
				System.out.println("아직 등록되지 않은 번호입니다.");
				
		}

	}

}
