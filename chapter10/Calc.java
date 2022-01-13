package chapter10;

public interface Calc {		// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);		// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();						// 디폴트 메서드에서 private 메서드 호출
	}
	
	static int total(int[] arr) {		// 인터페이스에 정적 메서드 total() 구현
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();				// 정적 메서드에서 private static 메서드 호출
		return total;
	}
	
	private void myMethod() {			// private 메서드
		System.out.println("private 메서드입니다.");
	}
	
	private static void myStaticMethod() {	// private static 메서드
		System.out.println("private static 메서드입니다.");
	}
}
