package chapter10;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;	// Customer Ŭ�������� customer�� Buy �������̽����� buyer�� ������ �� ��ȯ
		buyer.buy();			// buyer�� Buy �������̽��� �޼��常 ȣ�� ����
		buyer.order();
		
		Sell seller = customer;	// Customer Ŭ�������� customer�� Sell �������̽����� seller�� ������ �� ��ȯ
		seller.sell();			// seller�� Sell �������̽��� �޼��常 ȣ�� ����
		seller.order();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;	// seller�� ���� Ŭ�������� Customer�� �ٽ� �� ��ȯ
			customer2.buy();
			customer2.sell();
		}
	}

}
