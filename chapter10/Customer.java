package chapter10;

public class Customer implements Buy, Sell { 	// Customer Ŭ������ Buy�� Sell �������̽��� ��� ������

	@Override
	public void sell() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void buy() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");		// ����Ʈ �޼��� order()�� Customer Ŭ�������� ��������
	}

}
