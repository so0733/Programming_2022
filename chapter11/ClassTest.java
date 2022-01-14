package chapter11;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {	// forName() �޼��忡�� �߻��ϴ� ���ܸ� ó���� (�̸��� ��ġ�ϴ� Ŭ������ ���� ��� classNotFoundException �߻�)
		Person person = new Person();
		Class pClass1 = person.getClass();	// Object�� getClass() �޼��� ���
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;		// ���� class ���� ����
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter11.Person");	// Ŭ���� �̸� ��������
		System.out.println(pClass3.getName());
	}

}
