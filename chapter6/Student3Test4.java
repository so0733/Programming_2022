package chapter6;

public class Student3Test4 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이나영");
		System.out.println(Student3.getSerialNum( ));	// serialNum 값을 가져오기 위해 get() 메서드를 클래스 이름으로 직접 호출
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		
		Student3 studentSon = new Student3();
		studentSon.setStudentName("손흥민");
		System.out.println(Student3.getSerialNum( ));
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
		
	}

}
