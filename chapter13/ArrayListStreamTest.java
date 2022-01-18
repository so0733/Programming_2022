package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();			// ��Ʈ�� ����
		stream.forEach(s->System.out.print(s + " ")); // �迭 ��Ҹ� �ϳ��� ���
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.print(s + " "));
		// sList.stream() - ��Ʈ�� ���� ����
		// sorted(). - ����
		// forEach(s->System.out.print(s + " ")); - ��Ҹ� �ϳ��� ���� ���
	}
}
