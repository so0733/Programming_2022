package chapter11;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {	// forName() 메서드에서 발생하는 예외를 처리함 (이름과 일치하는 클래스가 없는 경우 classNotFoundException 발생)
		Person person = new Person();
		Class pClass1 = person.getClass();	// Object의 getClass() 메서드 사용
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;		// 직접 class 파일 대입
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter11.Person");	// 클래스 이름 가져오기
		System.out.println(pClass3.getName());
	}

}
