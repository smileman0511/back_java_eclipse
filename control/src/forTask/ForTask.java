package forTask;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//      1~10까지 반복 후 5~8을 제외하고 출력
//		for (int i = 0; i < 6; i++) {
//			int value = i + 1;
//			System.out.println(value > 4 ? value + 4 : value);
//		}

//      브론즈
//      1. 1~100까지 출력
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i + 1);
//		}

//      2. 100~1까지 출력
//		for(int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//		}

//      골드
//      1. 1~10까지 누적합을 출력
//		int total = 0;
//		for(int i = 0; i < 10; i++) {
//			total += i + 1;
//		}
//		System.out.println(total);

//      2. 1~n까지 누적합 출력
//		int num = 0, total = 0;
//		System.out.println("정수 1개를 입력하세요.");
//		num = sc.nextInt();
//		for(int i = 0; i < num; i++) {
//			total += i + 1;
//		}
//		System.out.println(total);

//      플레티넘
//      1. A~F까지 출력
//		for(int i = 0; i < 6; i++) {
//			System.out.print((char)('A' + i));
//		}
//      2. A~F까지 중 C를 제외하고 출력
//		for(int i = 0; i < 6; i++) {
//			System.out.print((char)('A' + i) == 'C' ? " " : (char)('A' + i));
//		}

//      다이아
//      1. aBcDeFg...Z 출력
		// 홀수는 소문자, 짝수는 대문자
//		int i = 0;
//		for(i = 0; i < 26; i++) {
//			int num = i + 1;
////			if(num % 2 == 1) {
////				System.out.print((char)('a' + i));
////			} else {
////				System.out.print((char)('A' + i));
////			}
//			System.out.print(num % 2 == 1 ? (char)('a' + i) : (char)('A' + i));
//		}

//      2. 별찍기 
//        *
//       ***
//      *****
		// i는 줄 번호, j는 공백 개수, k는 별 개수
//		int line = 5;
//
//        for (int i = 1; i <= line; i++) {
//            for (int j = 0; j < line - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//      마스터
//      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
//      단 반복할 횟수는 1~9까지만 입력할 수 있다.
//      입력 예시) a1b3c2
//      출력 예시) abbbcc
//		String str = "";
//		System.out.println("해당 문자와 반복 횟수를 입력해주세요.\nex) a1b3c2, 반복 횟수: 1~9");
//		str = sc.next();
//
//		for (int i = 0; i < str.length(); i += 2) {
//			char ch = str.charAt(i); // i번째에 있는 문자의 값을 저장, a2 -> a
//			int count = str.charAt(i + 1) - '0'; // - '0'은 왜? -> 문자 0의 아스키코드 값을 뺀다.
//
//			for (int j = 0; j < count; j++) {
//				System.out.print(ch);
//			}
//		}

///      2. 사용자가 입력한 횟수가 얼마인지 모르고,
//      입력한 횟수 만큼 문자를 만들어주는 프로그램
//      입력 예시) a1b22c357
//      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
		String message = "문자 + 숫자 형식의 문자열을 입력하세요.\nex)a1b22c347", input = null, result = "";

		System.out.println(message);
		input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i); // 문자

			String numberStr = "";
			i++;
//         다음 문자부터 숫자 읽기 시작
			while (i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				numberStr += input.charAt(i);
				i++;
			}

			int count = Integer.parseInt(numberStr);

			for (int j = 0; j < count; j++) {
				result += c;
			}
			i--;
		}

		System.out.println(result);
	}
}
