package chapter6;

public class Student2 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2( ) {		// 생성자
		serialNum++;			// 학생이 생성될 때마다 증가
		studentID = serialNum;	// 증가된 값을 학번 인스턴스 변수에 부여
	}
	
	public String getStudentName( ) {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
