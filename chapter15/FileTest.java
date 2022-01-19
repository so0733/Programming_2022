package chapter15;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\SCH\\src\\java_project\\220106\\newFile.txt");	// �ش� ��ο� File Ŭ���� ����
		file.createNewFile();							// ���� ���� ����
		
		System.out.println(file.isFile());				// ���� �Ӽ��� ���캸�� �޼��� ȣ���� ���
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();									// ���� ����
	}
}
