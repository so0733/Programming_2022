package chapter5;

public class ShoppingTest {
	String number;	// �ֹ� ��ȣ
	String id;		// �ֹ��� ���̵�
	String date;	// �ֹ� ��¥
	String name;	// �ֹ��� �̸�
	String no;		// �ֹ� ��ǰ ��ȣ
	String address;	// ����ּ�
	
	public static void main(String[] args) {
		ShoppingTest shopping = new ShoppingTest();
		shopping.number = "201803120001";
		shopping.id = "abc123";
		shopping.date = "2018�� 3�� 12��";
		shopping.name = "ȫ���";
		shopping.no = "PD0345-12";
		shopping.address = "����� �������� ���ǵ��� 20����";
				
		System.out.println(shopping.number);
		System.out.println(shopping.id);
		System.out.println(shopping.date);
		System.out.println(shopping.name);
		System.out.println(shopping.no);
		System.out.println(shopping.address);
	}
}
