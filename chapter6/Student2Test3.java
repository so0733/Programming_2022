package chapter6;

public class Student2Test3 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("�̳���");
		System.out.println(Student2.serialNum);	// serialNum ������ ���� Ŭ���� �̸����� ����
		System.out.println(studentLee.studentName + " �й�: " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�����");
		System.out.println(Student2.serialNum);
		System.out.println(studentSon.studentName + " �й�: " + studentSon.studentID);
		
	}
}
