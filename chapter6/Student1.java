package chapter6;

public class Student1 {
	public static int serialNum = 1000;	// static ������ �ν��Ͻ� ������ ��� ���� ���� ������
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName( ) {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
