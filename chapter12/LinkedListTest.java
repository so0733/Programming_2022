package chapter12;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");			// ��ũ�� ����Ʈ�� ��� �߰�
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);	// ����Ʈ ��ü ���
		
		myList.add(1, "D");			// ��ũ�� ����Ʈ�� ù ��° ��ġ�� D �߰�
		System.out.println(myList);
		
		myList.addFirst("0");		// ���� ����Ʈ�� �� �տ� 0 �߰�
		System.out.println(myList);
		
		System.out.println(myList.removeLast());	// ���� ����Ʈ�� �� �� ��� ���� �� �ش� ��Ҹ� ���
		System.out.println(myList);
	}

}
