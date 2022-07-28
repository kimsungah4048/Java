package example;

class CreditCard {
	private String company;
	
	CreditCard(String brand){ // 객체를 생성함과 동시에 필드에 값도 넣어줌. 
		company = brand;
	}
	
	String getCompany(){
		return company;
	}
	
	void setComapny(String brand){
		company = brand;
	}
}

public class Day09_EX3 {

	public static void main(String[] args) {
		CreditCard lotte = new CreditCard("롯데");
		CreditCard KB = new CreditCard("KB");
		CreditCard hyundai = new CreditCard("현대");
		System.out.println(lotte.getCompany() + "카드입니다.");
		System.out.println(KB.getCompany() + "카드입니다.");
		System.out.println(hyundai.getCompany() + "카드입니다.");

	}
}
