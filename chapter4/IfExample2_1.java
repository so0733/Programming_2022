package chapter4;

public class IfExample2_1 {

	public static void main(String[] args) {
		int age = 60;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�.");
		}
		else if(age < 20) {
			charge = 2000;
			System.out.println("�� ����л��Դϴ�.");
		}
		else {
			charge = 0;
			System.out.println("��ο���Դϴ�");	
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");
	}

}
