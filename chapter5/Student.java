package chapter5;

public class Student {	// Ŭ���� ����

	// �� ��� ����
	int studentID;		// �й�
	String studentName;	// �л� �̸�
	int grade;			// �г�
	String address;		// ��� ��
	
	public void showStudentInfo( ) {
		System.out.println(studentName + ", " + address);	// �̸�, �ּ� ���
	}
	
	public String getStudentName( ) {	// �л� �̸��� ��ȯ�ϴ� �޼���
		return studentName;
	}
	
	public void setStudentName(String name) {	// �л� �̸��� �Ű������� ����
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();	// Student Ŭ���� ����
		studentAhn.studentName = "ȫ�浿";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
