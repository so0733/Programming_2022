package chapter7;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[ ] data = new double[5];	// double������ ���� 5�� �迭 ����
		
		data[0] = 10.0;	// ù ��° ��ҿ� �� 10.0 ����
		data[1] = 20.0; // �� ��° ��ҿ� �� 20.0 ����
		data[2] = 30.0;	// �� ��° ��ҿ� �� 30.0 ����
		
		for(int i=0; i<data.length; i++) {	// ��ü �迭 ���� ��ŭ �ݺ�
			System.out.println(data[i]);
		}
	}

}
