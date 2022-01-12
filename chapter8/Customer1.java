package chapter8;

public class Customer1 {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer1( ) {
		initCustomer( );	// 고객 등급과 보너스 포인트 적립율 지정 함수 호출
	}
	
	public Customer1(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer( );
	}

	private void initCustomer( ) {	// 생성자에서만 호출하는 메서드
		customerGrade = "SILVER";	// 멤버 변수 초기화 부분
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo( ) {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + " 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
