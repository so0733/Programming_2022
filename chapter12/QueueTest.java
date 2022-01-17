package chapter12;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {		// ť�� �� �ڿ� �߰�
		arrayQueue.add(data);
	}
	
	public String deQueue() {				// ť�� �� �տ��� ����
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		return(arrayQueue.remove(0));		// �� ���� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
}

public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
