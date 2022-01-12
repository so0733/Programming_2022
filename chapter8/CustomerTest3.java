package chapter8;

public class CustomerTest3 {

	public static void main(String[] args) {
		Customer1 customerLee = new Customer1( );
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer1 customerKim = new VIPCustomer1(10020, "������", 12345);		// VIPCustomer�� Customer������ ����
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName( ) + "���� " + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println(customerKim.getCustomerName( ) + "���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerKim.showCustomerInfo());
	}

}
