package formatTest;

public class FormatTask01 {
	public static void main(String[] args) {
		// 식을 완성하기
		// 10 + 20 = 30
		// 7 * 8 = 56
		// 6 * 4 = 24
		int a = 0;
		int b = 0;
		int aPlusB = 0;
		int aMulB = 0;
		
		a = 10; 
		b = 20;
		aPlusB = a + b;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d + %d = %d\n\n", a, b, aPlusB);
		
		a = 7;
		b = 8;
		aMulB = a * b;
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d * %d = %d\n\n", a, b, aMulB);
		
		a = 6;
		b = 4;
		aMulB = a * b;
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d * %d = %d\n\n", a, b, aMulB);
		
		
	}
}
