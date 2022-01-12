package chapter8;

public class VIPCustomer extends Customer {	// VIPCustomer 클래스는 Customer 클래스를 상속반응
	private int agentID;			// VIP 고객 담당 상담원 아이디	(VIP 고객 관련 기능 구현 할 떄만 필요한 멤버 변수)
	double saleRatio;				// 할인율

	public VIPCustomer( ) {
		super( );	// 컴파일러가 자동으로 추가하는 코드	(상위 클래스의 Customer()가 호출됨)
		customerGrade = "VIP";		// 고객 등급 VIP	(디폴트 생성자)
		bonusRatio = 0.05;			// 보너스 적립 5%
		saleRatio = 0.1;			// 할인율 10%
		System.out.println("VIPCustomer( ) 생성자 호출 ");		// 하위 클래스 생성할 때 콘솔 출력문
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// 상위 클래스 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		//System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	@Override	// 재정의한 메서드
	public int CalcPrice(int price) {		// 보너스 포인트 적립, 지불 가격 계산 메서드
		bonusPoint += price * bonusRatio;	// 보너스 포인트 계산
		return price - (int)(price * saleRatio);	// 할인율 적용, 할인된 가격을 계산하여 반환
	}
	
	public int getAgentID( ) {				// VIP 고객에게만 필요한 메서드
		return agentID;
	}
	
}
