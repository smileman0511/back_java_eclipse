package lambdaTest;

public class LambdaTest {
   public static void main(String[] args) {
      Calc calc = (num1, num2) -> num1 + num2;
//      Calc calc = (num1, num2) -> {return num1 + num2;};
      
      
//      ex) 3.3 식으로 출력
      Calc2 calc2 = (num1,num2) -> num1 / (double)num2;
      
      System.out.println(calc.add(10, 3));
      System.out.println(calc2.divide(10, 3));
   }
}