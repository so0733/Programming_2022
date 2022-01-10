package chapter5;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentAhn = new Student( );	// Student 클래스 생성
		studentAhn.studentName = "홍길동";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName( ));
	}

}
