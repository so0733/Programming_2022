package chapter3;

public class OperationEx8 {

	public static void main(String[] args) {
		int num = 0B00000101;	// 5�� 8��Ʈ 2������ ǥ��
		System.out.println(num << 2);	// �������� 2��Ʈ �̵�
		System.out.println(num >> 2);	// ���������� 2��Ʈ �̵�
		System.out.println(num >>> 2);	// ���������� 2��Ʈ �̵�
		
		System.out.println(num);
		num = num << 2;
		System.out.println(num);
	}

}
