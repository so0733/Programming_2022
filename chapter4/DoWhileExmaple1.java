package chapter4;

public class DoWhileExmaple1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {	// ���ǽ��� ���� �ƴϴ��� ������ �� �� ����
			sum += num;
			num ++;
		} while(num <= 10);
		
		System.out.println("1~10 ���� ���� " + sum);
	}

}
