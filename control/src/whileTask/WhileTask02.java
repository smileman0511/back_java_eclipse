package whileTask;

import java.util.Scanner;

// 사용자에게 무한 입력 상태로 
// 입력 받은 모든 값의 합이 100 이상되면 프로그램이 종료된다.
// 그리고 입력 받은 모든 값은 순서대로 출력한다
// ex)
// 10
// 50
// 30
// -20
// 10
// 20

// 프로그램 종료
// 입력값: 10, 50, 30, -20, 10, 20
public class WhileTask02 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String message = "정수를 입력하세요\n10", 
            expression = null, prev = "", result = "";
      int total = 0, count = 0;
      
      while(true) {
         count++;
         System.out.println(message);
         expression = sc.next();
         total += Integer.parseInt(expression);
         
         result = count == 1 ? String.valueOf(Integer.parseInt(expression)) : prev + ", " + String.valueOf(Integer.parseInt(expression));
         prev = result;
         
         if(total >= 100) {
            System.out.println(total);
            System.out.println(result);
            break;
         }
      }
   }
}
