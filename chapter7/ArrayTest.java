package chapter7;

public class ArrayTest {

	public static void main(String[] args) {
		int[ ] num = new int[ ] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < num.length; i++) {	// �迭�� ù ��° ��Һ��� �� ��° ��ұ��� 10�� ���
			System.out.println(num[i]);			// num[0] ~ num[9]
		}
	}

}
