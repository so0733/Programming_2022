package chapter5;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentAhn = new Student( );	// Student Ŭ���� ����
		studentAhn.studentName = "ȫ�浿";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName( ));
	}

}
