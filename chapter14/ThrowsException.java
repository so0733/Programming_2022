package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {	// �� ���ܸ� �޼��尡 ȣ��� �� ó���ϵ��� �̷�
		FileInputStream fis = new FileInputStream(fileName);	// FileNotFoundException �߻� ����
		Class c = Class.forName(className);						// ClassNotFoundException �߻� ����
		return c;
	}
	
//	public static void main(String[] args) {
//		ThrowsException test = new ThrowsException();	
//		try {													// �޼��带 ȣ���� �� ���ܸ� ó���� (���� ���ܸ� �ѹ��� ó����)
//			test.loadClass("a.txt", "java.lang.String");
//		} catch (FileNotFoundException | ClassNotFoundException e) {	// ���� ���ܸ� �� �������� ó����
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();	
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {						// Exception Ŭ������ �� �� ���� ��Ȳ ó��
			e.printStackTrace();
		}
	}
}
