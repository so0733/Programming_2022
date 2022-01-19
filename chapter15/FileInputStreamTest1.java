package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");	// input.txt ���� �Է� ��Ʈ�� ����
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();						// ���� ��Ʈ���� finally ��Ͽ��� ����
			} catch(IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) {		// ��Ʈ���� null�� ���
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
