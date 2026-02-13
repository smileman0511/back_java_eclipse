package methodTask;

import java.util.Scanner;

public class MethodTask05 {
	String[] intDivide(String msg) {
		String result = ""; // 숫자를 담을 빈 문자열 생성

		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if (ch >= 48 && ch <= 57) {
				result += ch; // 숫자를 발견하면 결과 문자열에 추가
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//      2. 사용자가 입력하는 값중 정수 분리하기
//      입력 예시)
//      안1녕2하3세4요
//      출력 예시)
//      1234
		String msg = null;
		System.out.println("입력: \nex) 안1녕2하3세4요");
		msg = sc.nextLine();

		// 메서드를 호출하고 반환된 리턴 값을 변수에 저장
		String filteredNumbers = intDivide(msg);

		// 출력 예시
		System.out.println("출력 예시)");
		System.out.println(filteredNumbers);

//      3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//      입력 예시) apple
//      찾을 글자 p
//      반환 2

//      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드

//      5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력

//      6. 연속된 중복 문자 제거하기
//      입력 예시1)
//      abbbbacda
//      출력 예시1)
//      aacda

//      입력 예시2)
//      aabbccccd
//      출력 예시2)
//      abcd
	}
}
