package chapter12;

import chapter12.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "������");
		Member memberLee = new Member(1001, "�̽þ�");
		Member memberSon = new Member(1002, "�տ���");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ����");	// ���̵� �ߺ� ȸ�� �߰�
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
