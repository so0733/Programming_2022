package chapter9;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ���� ���Դϴ�.");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ�մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

}
