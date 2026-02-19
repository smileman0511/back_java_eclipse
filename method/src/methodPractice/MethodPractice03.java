package methodPractice;

public class MethodPractice03 {

	int getEvenTotal(int num) {
		int evenTotal = 0;
		for (int i = 0; i < num; i++) {
			if ((i + 1) % 2 == 0) {
				evenTotal += i + 1;
			}
		}
		return evenTotal;
	}

	public static void main(String[] args) {
//		1~n까지 짝수의 합만 구해서 반환하는 메서드
		MethodPractice03 mt = new MethodPractice03();
		int result = 0;
		result = mt.getEvenTotal(5);
		System.out.println(result);
	}
}
