package chapter6;

public class Student2Test2 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2( );
		studentLee.setStudentName("�̳���");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " �й�: " + studentLee.studentID);
		
		Student2 studentSon = new Student2( );
		studentSon.setStudentName("�����");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " �й�: " + studentSon.studentID);
	}
}
