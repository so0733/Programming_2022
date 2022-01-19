package chapter15;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나를 입력하시고 [Enter ↵]를 누르세요!");
		
		int i;
		
		try {
			i = System.in.read();			// read() 메서드로 한 바이트를 읽음
			System.out.println(i);
			System.out.println((char)i);	// 문자로 변환해 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
