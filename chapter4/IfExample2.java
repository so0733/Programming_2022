package chapter4;

public class IfExample2 {
	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ�����");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��̹Ƿ�");
		}
		else if(age < 20) {
			charge = 3000;
			System.out.println("�߰���л��̹Ƿ�");
		}
		else {
			charge = 4000;
			System.out.println("�����̹Ƿ�");	
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");
	}
}
