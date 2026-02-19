package methodPractice;

public class MethodPractice06 {

	int[] getMaxMin(int[] datas) {
		int[] result = new int[2];
		int max = datas[0], min = datas[0];
		for (int i = 0; i < datas.length; i++) {
			if (max > datas[i]) {
				max = datas[i];
			}
			if (min < datas[i]) {
				min = datas[i];
			}
		}
		result[0] = max;
		result[1] = min;

		return result;
	}

	public static void main(String[] args) {
//      3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
		MethodPractice06 mt = new MethodPractice06();
		int[] datas = { 10, 20, 30, 40, 50 };
		int[] result = mt.getMaxMin(datas);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
