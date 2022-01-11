package chapter6;

public class Student2Test3 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이나영");
		System.out.println(Student2.serialNum);	// serialNum 변수를 직접 클래스 이름으로 참조
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손흥민");
		System.out.println(Student2.serialNum);
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
		
	}
}
