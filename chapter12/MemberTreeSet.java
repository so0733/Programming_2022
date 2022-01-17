package chapter12;

import java.util.Iterator;
import java.util.TreeSet;

import chapter12.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {			// TreeSet�� ȸ���� �߰��ϴ� �޼���
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {		// TreeSet���� ȸ���� �����ϴ� �޼���
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {					// ��ü ȸ���� ����ϴ� �޼���
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println( );
	}
}

