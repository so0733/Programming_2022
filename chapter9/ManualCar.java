package chapter9;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� ���� ���Դϴ�.");
		System.out.println("����� �ڵ��� ���� �մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ���� �մϴ�.");
	}

}
