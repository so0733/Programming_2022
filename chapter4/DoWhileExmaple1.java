package chapter4;

public class DoWhileExmaple1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {	// 조건식이 참이 아니더라도 무조건 한 번 수행
			sum += num;
			num ++;
		} while(num <= 10);
		
		System.out.println("1~10 까지 합은 " + sum);
	}

}
