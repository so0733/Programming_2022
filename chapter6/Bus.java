package chapter6;

public class Bus {
	int busNumber;		// ���� ��ȣ
	int passengerCount;	// �°� ��
	int money;			// ���� ����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;	// ���� ��ȣ�� �Ű������� �޴� ������
	}
	
	public void take(int money) {	// �°��� ������ ź ��츦 ������ �޼���
		this.money += money;		// ���� ���� ����
		passengerCount++;			// �°� �� ����
	}
	
	public void showInfo( ) {
		System.out.println("����" + busNumber + " ���� �°��� " + passengerCount + " ���̰�, ������ " + money + " �Դϴ�. ");
	}
}
