package chapter8;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "������", 2000);		// VIP �� ����
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + vc.CalcPrice(10000) + " ���Դϴ�.");
	}

}
