package lambdaTask4;

import java.util.Scanner;

public class LambdaTask4 {
	public static void main(String[] args) {
//      1. 정수를 입력하면 정수에 해당하는 구구단을 출력해주는 람다
//      입력 예시)
//      3
//      출력 예시)
//      3 x 1 = 3
//      ...
//      3 x 9 = 27 
	   Scanner sc = new Scanner(System.in);
	   int inputNum = 0;
	   System.out.println("1~9 사이의 정수 1개를 입력하세요.");
	   inputNum = sc.nextInt();
	   
	   PrintGugudan pg = (num) -> {
           for (int i = 1; i <= 9; i++) {
               System.out.println(num + " x " + i + " = " + (num * i));
           }
       };

       pg.printGugudan(inputNum);

//      2. 두 개의 정수와 연산자를 전달하면 식을 완성시켜주는 람다
//      입력 예시1)
//      10, 20, "+"
//      
//      출력 예시1)
//      30

//      입력 예시2)
//      10, 20, "-"
//      
//      출력 예시2)
//      -10
		Calc calc = (num1, num2, oper) -> {
			switch (oper) {
			case "+":
				return num1 + num2;
			case "-":
				return num1 - num2;
			case "*":
				return num1 * num2;
			case "/":
				return num1 / num2;
			default:
				return 0;
			}
		};

		System.out.println(calc.calculate(10, 20, "+"));
		System.out.println(calc.calculate(10, 20, "-"));

//      3. 배열에 10개의 무작위 정수를 전달하면,
//      큰수부터(내림차순) 정렬하여 배열에 담아 리턴(반환)해주는 메서드
//      입력 예시)
//      {10, 3, 7, 8, 0, 9}

//      출력 예시)
//      {10, 9, 8, 7, 3, 0}
		SortArr sa = (arr) -> {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] < arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			return arr;
		};
		
		int[] input = {10, 3, 7, 8, 0, 9};
        int[] result = sa.sortDescend(input);

        System.out.print("{");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
	}
}
