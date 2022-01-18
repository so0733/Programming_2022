package chapter13;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);	// ���ٽ��� �������̽��� ������ �����ϰ� �� ������ ����� ���ٽ� ������ ȣ��
		lambdaStr.showString("hello lamda_1");
		showMyString(lambdaStr);							// �޼����� �Ű������� ���ٽ��� ������ ���� ����
		
		PrintString reStr = returnString();					// ������ ��ȯ ����
		reStr.showString("hello ");							// �޼��� ȣ��
	}
	
	public static void showMyString(PrintString p) {		// �Ű������� �������̽������� ����
		p.showString("hello lamda_2");
	}
	
	public static PrintString returnString() {				// ���ٽ��� ��ȯ�ϴ� �޼���
		return s -> System.out.println(s + "world");
	}
}
