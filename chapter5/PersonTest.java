package chapter5;

public class PersonTest {
	int age;			// ����
	String name;		// �̸�
	boolean married;	// ��ȥ ����
	int children;		// �ڳ� ��
	

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
