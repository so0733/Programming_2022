package chapter12;

import chapter12.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이동국");	// 새로운 회원 인스턴스 생성
		Member memberSon = new Member(1002, "손흥민");
		Member memberPark = new Member(1003, "박지성");
		Member memberHong = new Member(1004, "홍명보");
		
		memberArrayList.addMember(memberLee);			// ArrayList에 회원 추가
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();				// 전체 회원 출력
		
		memberArrayList.removeMember(memberHong.getMemberId());	// 홍명보 회원 삭제
		memberArrayList.showAllMember();				// 홍명보 회원을 삭제한 후 다시 전체 회원 출력
	}

}
