package chapter7;

public class ArrayTest {

	public static void main(String[] args) {
		int[ ] num = new int[ ] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < num.length; i++) {	// 배열의 첫 번째 요소부터 열 번째 요소까지 10개 출력
			System.out.println(num[i]);			// num[0] ~ num[9]
		}
	}

}
