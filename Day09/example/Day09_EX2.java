package example;

	class Lesson{
		private String Language;
		
		Lesson(String name){
			Language = name;
		}
	
		// Language의 getter
		String getLanguage() {
			return Language;
		}
		
		// Language의 setter
		void setLanugage(String name) {
			Language = name;
		}
	}

public class Day09_EX2 {

	
	public static void main(String[] args) {
		Lesson java = new Lesson("자바");
		Lesson python = new Lesson("파이썬");
		
		System.out.println(java.getLanguage() + "반 입니다.");
		System.out.println(python.getLanguage() + "반 입니다.");

	}

}
