package chapter6;

public class Student3Test4 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("�̳���");
		System.out.println(Student3.getSerialNum( ));	// serialNum ���� �������� ���� get() �޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentLee.studentName + " �й�: " + studentLee.studentID);
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("�����");
		System.out.println(Student3.getSerialNum( ));
		System.out.println(studentSon.studentName + " �й�: " + studentSon.studentID);
		
	}

}
