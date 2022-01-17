package chapter12;

import chapter12.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "�̵���");	// ���ο� ȸ�� �ν��Ͻ� ����
		Member memberSon = new Member(1002, "�����");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ��");
		
		memberArrayList.addMember(memberLee);			// ArrayList�� ȸ�� �߰�
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();				// ��ü ȸ�� ���
		
		memberArrayList.removeMember(memberHong.getMemberId());	// ȫ�� ȸ�� ����
		memberArrayList.showAllMember();				// ȫ�� ȸ���� ������ �� �ٽ� ��ü ȸ�� ���
	}

}
