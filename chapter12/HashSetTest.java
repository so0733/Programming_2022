package chapter12;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("�ڼ���"));
		hashSet.add(new String("�����"));
		hashSet.add(new String("��ġȫ"));
		hashSet.add(new String("��ġȫ"));
		hashSet.add(new String("�ѵ���"));
		
		System.out.println(hashSet);
	}

}
