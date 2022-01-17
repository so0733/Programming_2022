package chapter12;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("¹Ú¼¼¿õ"));
		hashSet.add(new String("±è¿øÁß"));
		hashSet.add(new String("¾ÈÄ¡È«"));
		hashSet.add(new String("¾ÈÄ¡È«"));
		hashSet.add(new String("ÇÑµ¿Èñ"));
		
		System.out.println(hashSet);
	}

}
