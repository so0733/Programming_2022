package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")) {
			fos.write(65);	// FileOutputStream�� ���Ͽ� ���ڸ� ���� �ش��ϴ� �ƽ�Ű �ڵ� ������ ��ȯ��
			fos.write(66);
			fos.write(67);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ� �Ǿ����ϴ�.");
	}
}
