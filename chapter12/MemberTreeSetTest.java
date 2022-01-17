package chapter12;

import chapter12.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "박지영");
		Member memberLee = new Member(1001, "이시아");
		Member memberSon = new Member(1002, "손예빈");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍서은");	// 아이디 중복 회원 추가
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
