package inputTask;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
		// Scanner를 사용하여, 두 정수를 입력 받고,
		// 덧셈 결과를 출력하시오.
		// 단 next()만 사용

		Scanner sc = new Scanner(System.in);
		String msg = "정수 2개를 입력하세요.";
		String num1 = null, num2 = null, resultMsg = "";
		int num1ToInt = 0, num2ToInt = 0;

		System.out.println(msg);
		
		num1 = sc.next();
		num2 = sc.next();
		
		num1ToInt = Integer.parseInt(num1);
		num2ToInt = Integer.parseInt(num2);
		
		resultMsg = "입력한 정수 2개는 %d, %d입니다.";
		System.out.printf(resultMsg, num1ToInt, num2ToInt);

	}
}