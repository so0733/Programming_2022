package chapter13;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {	// BinaryOperator�� ������ Ŭ���� ����

	@Override
	public String apply(String s1, String s2) {			// reduce() �޼��尡 ȣ��� �� �Ҹ��� �޼���(�� ���ڿ� ���̸� ����)
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}	
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = {"�ȳ��Ͻʴϱ�?~~~", "hello!", "Good Morining", "�ݰ����ϴ�^^"};
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {	// ���ٽ��� ���� �����ϴ� ���
							if(s1.getBytes().length >= s2.getBytes().length)
								return s1;
							else return s2;
		}));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();	// BinaryOperator�� ������ Ŭ���� ���
		System.out.println(str);
	}
}
