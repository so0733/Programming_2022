package chapter5;

public class StudentTest3 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "홍길동";
		
		Student student2 = new Student();
		student2.studentName = "이순신";
		
		System.out.println(student1);	// 참조 변수 값 출력
		System.out.println(student2);
	}

}
