package methodPractice;

public class MethodPractice02 {
	
	int getSmallNum(int num1, int num2) {
		if(num1 > num2) {
			return num2;
		}
		else {
			return num1;
		}
	}
	
	public static void main(String[] args) {
//		정수 2개를 넘겨서, 더 작은 수를 반환하는 메서드
		MethodPractice02 mt = new MethodPractice02();
		int result = 0;
		result = mt.getSmallNum(1, 2);
		
		System.out.println(result);
		System.out.println(mt.getSmallNum(1, 2));
	}
}
