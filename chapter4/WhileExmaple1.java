package chapter4;

public class WhileExmaple1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {	// num ���� 10���� �۰ų� ���� ����
			
			// ���ǽ��� ���� ���� �Ʒ��� �ݺ�
			sum += num;		// �հ踦 ���ϴ� sum�� num�� ���ϰ�
			num++;			// num�� 1�� ���� ����
		}
		System.out.println("1~10 ���� ���� " + sum);
	}

}
