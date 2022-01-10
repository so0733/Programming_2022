package chapter5;

public class Person1Test {

	public static void main(String[] args) {
		Person1 personLee = new Person1();	// 생성자
		personLee.name = "이순신";	// 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		personLee.weight = 104.5F;
		personLee.height = 177.5F;
		
		// Person1 personKim = new Person1("이순신", 180, 85);	// 인스턴스 변수 초기화와 동시에 클래스 생성
	}

}
