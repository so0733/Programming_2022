package chapter5;

public class Student4 {
	int studentID;
	private String studentName;	// studentName 변수를 private으로 선언
	int grade;
	String address;
	
	public String getStudentName( ) {	// private 변수인 studentName에 접근해 값을 가져옴
		return studentName;
	}
	
	public void setStudentName(String studentName) {	// private 변수인 studentName에 접근해 값을 지정
		this.studentName = studentName;
	}
}
