package methodTask;

import methodTest.MethodTest;

public class MethodTask {

	void print1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

	int getTotal(int num) {
		int total = 0;
		for(int i = 0; i < num; i++) {
			total += i + 1;
		}
		return total;
	}

	public static void main(String[] args) {
//      1. 1~10까지 출력하는 메서드
		MethodTask mt = new MethodTask();
//		mt.print1To10();

//		2. 1~n까지의 합을 반환해주는 메서드
		int total = 0;
		total = mt.getTotal(5);
		System.out.println(total);
	}
}