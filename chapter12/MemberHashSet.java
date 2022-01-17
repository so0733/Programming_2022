package chapter12;

import java.util.HashSet;
import java.util.Iterator;

import chapter12.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;		// HashSet ����
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();	// HashSet ����
	}
	
	public void addMember(Member member) {	// HashSet�� ȸ���߰�
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {		// �Ű������� ���� ȸ�� ���̵� �ش��ϴ� ȸ�� ����
		Iterator<Member> ir = hashSet.iterator();	// Iterator�� Ȱ���� ��ȸ��
		
		while(ir.hasNext()) {
			Member member = ir.next();				// ȸ���� �ϳ��� �����ͼ�
			int tempId = member.getMemberId();		// ���̵� ��
			if(tempId == memberId) {				// ���� ���̵��� ���
				hashSet.remove(member);				// ȸ�� ����
				return true;
			}
		}
		System.out.println(memberId + " �� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {			// ��� ȸ�� ���
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println( );
	}
}
