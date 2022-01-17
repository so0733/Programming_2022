package chapter12;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("아이언맨");
		treeSet.add("토르");
		treeSet.add("스파이더맨");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
