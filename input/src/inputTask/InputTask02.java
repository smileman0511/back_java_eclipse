package inputTask;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자가 입력한 정수 또는 실수의 값이
		// 정수인지 실수인지 확인 후 출력하는 로직을 구현하세요.
		// 10 - 정수, 10.0 - 실수, 10.5 - 실수

		System.out.println("정수 또는 실수 1개를 입력하세요.");
		String str = "";
		str = sc.next();
		
		// (str.indexOf(".") > 0) -> 규호형 코드
		if(str.contains(".")) {
			System.out.printf("%s는 실수", str);
		}
		else {
			System.out.printf("%s는 정수", str);
		}
	}
}
