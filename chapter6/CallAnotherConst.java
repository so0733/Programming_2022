package chapter6;

class Person {
	String name;
	int age;
	
	Person() {
		this("�̸� ����", 1);		// this�� ����� Person(String, int) �����ڸ� ȣ����
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf( ) {	// ��ȯ���� Ŭ������
		return this;			// this ��ȯ
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();	// this ���� Ŭ���� ������ ����
		System.out.println(p); 				// noName.returnItSelf()�� ��ȯ �� ���
		System.out.println(noName);			// ���� ���� ���
	}

}
