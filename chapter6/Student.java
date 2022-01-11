package chapter6;

public class Student {
	public String studentName;	// �л� �̸�
	public int grade;			// �г�
	public int money;			// �л��� ������ �ִ� ��
	
	public Student(String studentName, int money) {	// �л� �̸��� ���� ���� �Ű������� �޴� ������
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {	// �л��� ������ Ÿ�� 1000���� �����ϴ� ����� ������ �޼���
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {	// �л��� ����ö�� Ÿ�� 1500�� �����ϴ� ��� ������ �޼���
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + " ���� ���� ����" + money + "�Դϴ�.");
	}
}
