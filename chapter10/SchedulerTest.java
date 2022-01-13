package chapter10;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �� �� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		
		int ch = System.in.read();			// �Ҵ� ����� �Է¹޾� ch ������ ����
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {		// �Է¹��� ���� R(r)�̸� RoundRobin Ŭ���� ����
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {	// �Է¹��� ���� L(l)�̸� LeastJob Ŭ���� ����
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {	// �Է¹��� ���� P(p)�̸� PriorityAllocation Ŭ���� ����
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();			// � ��å�ΰ��� ������� �������̽��� ������ �޼��� ȣ��
		scheduler.sendCallToAgent();
		
	}

}
