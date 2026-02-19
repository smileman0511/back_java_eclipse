package methodPractice;

public class MethodPractice05 {
	
	int[] calc(int num1, int num2) {
		int[] result = new int[4];
		result[0] = num1 + num2;
		result[1] = num1 - num2;
		result[2] = num1 * num2;
		result[3] = num1 / num2;
		
		return result;
	}
	
	public static void main(String[] args) {
//      2. 두 정수를 넘기면 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
//		배열 응용?
		MethodPractice05 mt = new MethodPractice05();
		int[] result = mt.calc(3, 5);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
}
