package chapter5;

public class ShoppingTest {
	String number;	// 주문 번호
	String id;		// 주문자 아이디
	String date;	// 주문 날짜
	String name;	// 주문자 이름
	String no;		// 주문 상품 번호
	String address;	// 배송주소
	
	public static void main(String[] args) {
		ShoppingTest shopping = new ShoppingTest();
		shopping.number = "201803120001";
		shopping.id = "abc123";
		shopping.date = "2018년 3월 12일";
		shopping.name = "홍길순";
		shopping.no = "PD0345-12";
		shopping.address = "서울시 영등포구 여의도동 20번지";
				
		System.out.println(shopping.number);
		System.out.println(shopping.id);
		System.out.println(shopping.date);
		System.out.println(shopping.name);
		System.out.println(shopping.no);
		System.out.println(shopping.address);
	}
}
