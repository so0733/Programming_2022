package chapter10;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;	// Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입해 형 변환
		buyer.buy();			// buyer는 Buy 인터페이스의 메서드만 호출 가능
		buyer.order();
		
		Sell seller = customer;	// Customer 클래스형인 customer를 Sell 인터페이스형인 seller에 대입해 형 변환
		seller.sell();			// seller는 Sell 인터페이스의 메서드만 호출 가능
		seller.order();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;	// seller를 하위 클래스형인 Customer로 다시 형 변환
			customer2.buy();
			customer2.sell();
		}
	}

}
