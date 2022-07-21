package example;

public class Day06_EX4 {
	public static void main(String[] args) {
		int score[] = {70, 95, 85};
		int sum = 0;
					// 국, 영, 수 : 세 과목의 평균을 구해주세요.
					// 세 과목의 점수의 합 / 과목 수
			for (int i = 0; i < score.length; i++) { // score를 한바퀴 돌 수 있게
				sum = sum + score[i]; // sum = 70
									// sum = 165
									// sum = 250

		}
			System.out.println(sum / score.length);
	}
}
