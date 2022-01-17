package chapter12;

import chapter12.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "박지원");
		Member memberLee = new Member(1001, "이정주");
		Member memberHong = new Member(1004, "홍수빈");
		Member memberSon = new Member(1002, "손종훈");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);			// 회원 아이디(key 값)가 1004인 회원 삭제
		memberHashMap.showAllMember();
	}

}
