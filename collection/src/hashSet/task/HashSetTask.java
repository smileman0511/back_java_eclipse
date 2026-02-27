package hashSet.task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTask {
   public static void main(String[] args) {
//      "banana", "apple", "orange", "apple", "banana"
//      문자열 ArrayList가 존재할 때 중복이 되지 않는 글자만 연결하여 출력하기
//      ex) 출력 결과: banpleorg
      
      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("banana", "apple", "orange", "apple", "banana"));
//      System.out.println(datas);
      
      // HashSet 선언
      // 결과를 담을 문자열 초기화
      // datas를 for문에 넣고 돌리기
      // 문자열 배열을 문자형 배열로 for문
      // 문자가 포함 X면 추가
      HashSet<Character> overLapChar = new HashSet<Character>();
      String result = "";
      
      for (String word : datas) {
//    	  System.out.println(word);
         for (char c : word.toCharArray()) {
//        	 System.out.println(c);
            if (!overLapChar.contains(c)) {
            	overLapChar.add(c);
            	System.out.println(overLapChar);
               result += c;
               System.out.println(result);
            }
         }
      }
      
      System.out.println("출력 결과: " + result);
      
   }
}