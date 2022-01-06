package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		System.out.println("----------");

		int a = 100;
		System.out.println(a++);
		
		int a1 = 100;
		System.out.println(++a1);
		
		int b = 100;
		System.out.println(b--);
		
		int b1 = 100;
		System.out.println(--b1);
	}

}
