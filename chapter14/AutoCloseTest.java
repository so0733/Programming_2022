package chapter14;

public class AutoCloseTest {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj( )) {	// ����� ���ҽ� ����

		} catch(Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}
	}
}
