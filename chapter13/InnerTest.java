package chapter13;

class OutClass {					// �ܺ� Ŭ����
	private int num = 10;			// �ܺ� Ŭ���� private ����
	private static int sNum = 20;	// �ܺ� Ŭ���� ���� ����
	
	static class InStaticClass {	// ���� ���� Ŭ����
		int inNum = 100;			// ���� ���� Ŭ������ �ν��Ͻ� ����
		static int sInNum = 200;	// ���� ���� Ŭ������ ���� ����
		
		void inTest() {				// ���� ���� Ŭ������ �Ϲ� �޼���
		// num += 10;				// �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ���� �ּ� ó��
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}
		
		static void sTest() {		// ���� ���� Ŭ������ ���� �޼���
//			num += 10;				// �ܺ� Ŭ������ ���� Ŭ������ �ν��Ͻ� ������ ����� �� ���� �ּ�ó��
//			inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}
	
	private InClass inClass;		// ���� Ŭ���� �ڷ��� ������ ���� ������
	
	public OutClass() {				// �ܺ� Ŭ���� ����Ʈ ������(�ܺ� Ŭ������ ������ �Ŀ� ���� Ŭ���� ���� ������)
		inClass = new InClass();
	}
	
	class InClass {					// �ν��Ͻ� ���� Ŭ����
		int inNum = 100;			// ���� Ŭ������ �ν��Ͻ� ����
//		static int sInNum = 200;	// �ν��Ͻ� ���� Ŭ������ ���� ���� ���� �Ұ���(������ �߻��� �ּ� ó��)
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
			System.out.println( );
		}
		
//		static void sTest() {		// ���� �޼��� ���� ���� �Ұ���(������ �߻��� �ּ� ó��)
//			
//		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass(); 		// ���� Ŭ���� ��� ȣ��
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();	// �ܺ� Ŭ������ �������� �ʰ� �ٷ� ���� ���� Ŭ���� ���� ����
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println( );
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
	}
}
