package chapter8;
import java.util.ArrayList;

public class CustomerTest4 {

	public static void main(String[] args) {
		ArrayList<Customer1> customerList = new ArrayList<Customer1>( );
		
		Customer1 customerLee = new Customer1(10010, "�̼���");
		Customer1 customerShin = new Customer1(10020, "�Ż��Ӵ�");
		Customer1 customerHong = new GoldCustomer(10030, "ȫ�浿");
		Customer1 customerYoul = new GoldCustomer(10040, "������");
		Customer1 customerKim = new VIPCustomer1(10050, "������", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("====== �� ���� ��� ======");
		for(Customer1 customer1 : customerList) {
			System.out.println(customer1.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		int price = 10000;
		for(Customer1 customer1 : customerList) {
			int cost = customer1.calcPrice(price);
			System.out.println(customer1.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer1.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer1.bonusPoint + "�� �Դϴ�.");
		}
		
	}

}
