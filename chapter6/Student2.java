package chapter6;

public class Student2 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2( ) {		// ������
		serialNum++;			// �л��� ������ ������ ����
		studentID = serialNum;	// ������ ���� �й� �ν��Ͻ� ������ �ο�
	}
	
	public String getStudentName( ) {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
