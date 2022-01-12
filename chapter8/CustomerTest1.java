package chapter8;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer( );
		customerLee.setCustomerID(10010);		// customerID와 customerName은 protected 변수이므로 set() 메서드 호출
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(0, "김유신", 0 );
		customerKim.setCustomerID(10020);		// customerID와 customerName은 protected 변수이므로 set() 메서드 호출
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
