package chapter4;

public class ForExmaple1 {

	public static void main(String[] args) {
		int i, sum;
		
		for(i=1, sum=0; i<=10; i++) {
			sum += i;
		}
		System.out.println("1~10 까지 합은 " + sum);
	}

}
