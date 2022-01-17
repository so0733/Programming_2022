package chapter12;

import chapter12.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "이정후");
		Member memberSon = new Member(1002, "손아섭");
		Member memberPark = new Member(1003, "박세웅");
		Member memberHong = new Member(1004, "홍창기");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);		// 회원 아이디(key 값)가 1004인 회원 삭제
		memberHashMap.showAllMember();
	}

}
