package chapter15;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸� : ");		// ���ڿ��� �д� nextLine()�޼���� �̸��� ���� �Է¹���
		String name = scanner.nextLine();
		System.out.println("���� : ");
		String job = scanner.nextLine();
		System.out.println("��� : ");		// int���� �д� nextInt() �޼���� ����� �Է¹���
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}
}
