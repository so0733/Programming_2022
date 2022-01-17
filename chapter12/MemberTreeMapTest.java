package chapter12;

import chapter12.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "������");
		Member memberLee = new Member(1001, "������");
		Member memberHong = new Member(1004, "ȫ����");
		Member memberSon = new Member(1002, "������");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);			// ȸ�� ���̵�(key ��)�� 1004�� ȸ�� ����
		memberHashMap.showAllMember();
	}

}
