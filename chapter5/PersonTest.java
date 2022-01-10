package chapter5;

public class PersonTest {
	int age;			// 나이
	String name;		// 이름
	boolean married;	// 결혼 여부
	int children;		// 자녀 수
	

	public static void main(String[] args) {
		PersonTest person = new PersonTest( );
		person.age = 40;
		person.name = "James";
		person.married = true;
		person.children = 3;
		
		System.out.println(person.age);
		System.out.println(person.name);
		System.out.println(person.married);
		System.out.println(person.children);
	}

}
