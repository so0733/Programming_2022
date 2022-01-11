package chapter6;

public class Student2Test2 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2( );
		studentLee.setStudentName("ÀÌ³ª¿µ");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " ÇĞ¹ø: " + studentLee.studentID);
		
		Student2 studentSon = new Student2( );
		studentSon.setStudentName("¼ÕÈï¹Î");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " ÇĞ¹ø: " + studentSon.studentID);
	}
}
