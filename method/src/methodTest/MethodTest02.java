package methodTest;

public class MethodTest02 {

	int[] test(int[] data) {
		data[0] = 20;
		return data;
	}

	public static void main(String[] args) {
		MethodTest02 ts = new MethodTest02();
		int[] data = { 50 };

		ts.test(data);
		System.out.println(data[0]);
	}

}
