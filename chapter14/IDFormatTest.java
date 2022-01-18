package chapter14;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	// IDFormatException 예외를 setUserID() 메서드가 호출될 때 처리하도록 미룸
	public void setUserID(String userID) throws IDFormatException {		// 아이디에 대한 제약 조건 구현
		if(userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없습니다.");			// 강제로 예외 발생시킴
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰셔야 합니다.");	// 강제로 예외 발생시킴
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;						// 아이디 값이 null 인 경우
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	
		userID = "1234567";							// 아이디 값이 8자 이하인 경우
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}	
	}
}