package chapter8;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer( );
		customerLee.setCustomerID(10010);		// customerID�� customerName�� protected �����̹Ƿ� set() �޼��� ȣ��
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(0, "������", 0 );
		customerKim.setCustomerID(10020);		// customerID�� customerName�� protected �����̹Ƿ� set() �޼��� ȣ��
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
