package chapter14;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {										// ���ܰ� �߻��� �� �־� try ��Ͽ� �ۼ�
			for(int i=0; i<=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {	// ���ܰ� �߻��ϸ� catch ��� ����
			System.out.println(e);
			System.out.println("���� ó�� �κ�");
		}
		System.out.println("���α׷� ����");
	}
}
