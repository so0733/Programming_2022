package chapter6;

public class Student1Test1 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1( );
		studentLee.setStudentName("이지영");
		System.out.println(studentLee.serialNum);	// serialNum 변수 초깃값 출력
		studentLee.serialNum++;	// static 변수값 증가
		
		Student1 studentSon = new Student1( );
		studentSon.setStudentName("손흥민");
		System.out.println(studentSon.serialNum);	// 증가된 값 출력
		System.out.println(studentLee.serialNum);
		
	}
}
