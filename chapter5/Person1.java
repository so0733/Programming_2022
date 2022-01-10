package chapter5;

public class Person1 {
	String name;
	float height;
	float weight;
	
	public Person1() { } // 자바 컴파일러가 자동으로 제공하는 디폴트 생성자
	
	public Person1(String pname) {
		name = pname;	// 사람 이름을 매개변수로 입력받아 Person1 클래스를 생성하는 생성자
	}
	
	public Person1(String pname, float pheight, float pweight) {
		name = pname;	// 이름, 키, 몸무게를 매개변수로 입력 받는 생성자
		height = pheight;
		weight = pweight;
	}
}
