package chapter5;

public class Student4 {
	int studentID;
	private String studentName;	// studentName ������ private���� ����
	int grade;
	String address;
	
	public String getStudentName( ) {	// private ������ studentName�� ������ ���� ������
		return studentName;
	}
	
	public void setStudentName(String studentName) {	// private ������ studentName�� ������ ���� ����
		this.studentName = studentName;
	}
}
