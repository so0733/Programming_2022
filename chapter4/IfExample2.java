package chapter4;

public class IfExample2 {
	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동으로");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생이므로");
		}
		else if(age < 20) {
			charge = 3000;
			System.out.println("중고등학생이므로");
		}
		else {
			charge = 4000;
			System.out.println("성인이므로");	
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
	}
}
