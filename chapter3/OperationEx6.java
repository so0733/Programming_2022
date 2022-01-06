package chapter3;

public class OperationEx6 {

	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		int c = 100;
		
		System.out.println(a += 2);
		System.out.println(a -= 2);
		System.out.println(a *= 2);
		System.out.println(a /= 2);
		System.out.println(a &= 2);
		
		System.out.println("----------");
		
		System.out.println(b <<= 1);
		System.out.println(b >>= 1);
		System.out.println(b >>>= 1);
		
		System.out.println("----------");
		
		System.out.println(c &= 100);
		System.out.println(c |= 100);
		System.out.println(c ^= 100);
	}

}
