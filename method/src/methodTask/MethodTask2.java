package methodTask;

import java.util.Scanner;

public class MethodTask2 {
//  배열 응용
	void whatType(char[] ch) {
		char letter = ch[0];
		if (letter >= 'A' && letter <= 'Z') {
			System.out.println("대문자입니다.");
		} else if (letter >= 'a' && letter <= 'z') {
			System.out.println("소문자입니다.");
		} else {
			System.out.println("일반문자입니다.");
		}
	}

	String calculate(int num1, int num2) {
		int plus = num1 + num2;
		int minus = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		String result = "덧셈: " + plus + ", 뺄셈: " + minus + ", 곱셈: " + mul + ", 나눗셈: " + div;

		return result;
	}

	void maxMin(int[] number) {
		int max = number[0], min = number[0];
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
			if (min > number[i]) {
				min = number[i];
			}
		}

		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);

	}

	public static void main(String[] args) {
//      1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
//		배열 응용이면 문자형 배열 선언?
//	   	글자 1개를 넘긴다.
//		아스키코드 값 범위로 나눈다.
//		main 메서드에서 출력? 선언?
		MethodTask2 mt = new MethodTask2();
//		char[] ch = { 'F' };
//		mt.whatType(ch);
		
//      2. 두 정수를 더하면 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
//		정수 2개 넘기기.
//		각 결과 반환
//		근데 리턴 값은 1개
//		문자열로 해서 String 타입으로 넘겨?
		int num1 = 10, num2 = 5;
		String result = mt.calculate(num1, num2);
		System.out.println(result);

//      3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
//		정수 5개를 입력해서 그거로 넘겨도 되나?
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 5개를 입력하세요.\nex) 1 2 3 4 5");
//		int[] number = new int[5];
//		for(int i = 0; i < number.length; i++) {
//			number[i] = sc.nextInt();
//		}
//		
//		mt.maxMin(number);

	}
}


//package methodTask;
//
//public class MethodTask2 {
//   
////      1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
//   String checkChar(char c) {
//      String result = "";
//      
//      if(c >= 65 && c <= 90) {
//         result = "대문자";
//      }else if(c >= 97 && c <= 122) {
//         result = "소문자";
//      }else {
//         result = "일반 문자";
//      }
//      return result;
//   };
//   
////   2. 두 정수를 받아서 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
//   int[] calc(int num1, int num2) {
//      int[] result = new int[4];
//      
//      result[0] = num1 + num2;
//      result[1] = num1 - num2;
//      result[2] = num1 * num2;
//      result[3] = num1 / num2;
//      return result;
//   }
//   
////   3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
//   int[] getMinAndMax(int[] datas) {
//      int[] result = new int[2];
//      int min = datas[0], max = datas[0];
//      for(int data: datas) {
//         if(min > data) { min = data; };
//         if(max < data) { max = data; };
//      }
//      
//      result[0] = min;
//      result[1] = max;
//      return result;
//   }
//   
//   
//   public static void main(String[] args) {
//      MethodTask2 mt2 = new MethodTask2();
//      
////      System.out.println(mt2.checkChar('ㅁ'));
//      
//      int[] result2 = mt2.calc(10, 20);
//      for(int result : result2) {
//         System.out.println(result);
//      }
//      
//      int[] datas = {10, 20, 30, 40, 50};
//      int[] result3 = mt2.getMinAndMax(datas);
//      for(int result: result3) {
//         System.out.println(result);
//      }
//      
//
//   }
//}