package chapter12;

import chapter12.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이동국");
		Member memberSon = new Member(1002, "손흥민");
		Member memberPark = new Member(1003, "박지성");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍명보");	// 아이디 중복 회원 추가
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}

}
