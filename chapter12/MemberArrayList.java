package chapter12;

import java.util.ArrayList;
import chapter12.Member;		// Member Ŭ������ chapter12 ��Ű���� �����Ƿ� ����Ϸ��� import�ؾ� ��

public class MemberArrayList {
	private ArrayList<Member> arrayList;		// ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();	// Member������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		arrayList.add(member);					// ArrayList�� ȸ���� �߰��ϴ� �޼���
	}
	
	public boolean removeMember(int memberId) {	// �ش� ���̵� ���� ȸ���� ArrayList���� ã�� ������
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);	// get() �޼���� ȸ���� ���������� ������
			int tempId = member.getMemberId();
			if(tempId == memberId) {			// ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);			// �ش� ȸ���� ����
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");	// �ݺ����� ���� ������ �ش� ���̵� ã�� ���� ���
		return false;
	}
	
	public void showAllMember() {				// ��ü ȸ���� ����ϴ� �޼���
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println( );
	}
}
