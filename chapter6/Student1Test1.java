package chapter6;

public class Student1Test1 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1( );
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);	// serialNum ���� �ʱ갪 ���
		studentLee.serialNum++;	// static ������ ����
		
		Student1 studentSon = new Student1( );
		studentSon.setStudentName("�����");
		System.out.println(studentSon.serialNum);	// ������ �� ���
		System.out.println(studentLee.serialNum);
		
	}
}
