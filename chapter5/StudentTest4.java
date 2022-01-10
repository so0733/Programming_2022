package chapter5;

public class StudentTest4 {
	public static void main(String[ ] args) {
		Student4 studentLee = new Student4();
		//studentLee.studentName = "이순신";
		studentLee.setStudentName("이순신");
		
		System.out.println(studentLee.getStudentName());
	}
}
