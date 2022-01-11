package chapter6;

public class Subway {
	String lineNumber;		// ����ö �뼱
	int passengerCount;		// �°� ��
	int money;				// ���Ծ�
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;	// ����ö �뼱 ��ȣ�� �Ű������� �޴� ������
	}
	
	public void take(int money)	{	// �°��� ����ö�� ź ��츦 ������ �޼���
		this.money += money;	// ���� ����
		passengerCount++;		// �°� �� ����
	}
	
	public void showInfo( ) {
		System.out.println(lineNumber + " �� �°��� " + passengerCount + " ���̰�, ������ " + money + " �Դϴ�. ");
	}
}
