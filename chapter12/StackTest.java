package chapter12;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {		// ������ �� �ڿ� ��Ҹ� �߰�
		arrayStack.add(data);
	}
	
	public String pop() {				// ������ �ǵڿ��� ��Ҹ� ����
		int len = arrayStack.size();	// ArrayList�� ����� ��ȿ�� �ڷ��� ����
		if(len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		
		return(arrayStack.remove(len-1));	// �� �ڿ� �ִ� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
}

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
