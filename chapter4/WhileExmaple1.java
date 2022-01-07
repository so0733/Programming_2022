package chapter4;

public class WhileExmaple1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {	// num 값이 10보다 작거나 같을 동안
			
			// 조건식이 참인 동안 아래를 반복
			sum += num;		// 합계를 뜻하는 sum에 num을 더하고
			num++;			// num에 1씩 더해 나감
		}
		System.out.println("1~10 까지 합은 " + sum);
	}

}
