package chapter4;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {	// 100까지 반복
			if(num % 2 == 0)			// num 값이 짝수 일 때
				continue;				// 이후 수행 생략하고 num++ 수행
			total += num;				// num 값이 홀수인 경우에만 수행
		}
		System.out.println("1~100까지 홀수 합은 " + total);
	}

}
