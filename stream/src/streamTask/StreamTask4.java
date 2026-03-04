package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask4 {
	public static void main(String[] args) {
//      모두 Stream 문법으로 활용
//      1. 1~10까지 ArrayList에 담고 총 합을 출력
//		ArrayList<Integer> data1 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(data1::add);
//		
//		int sum = 0;
//		for (int i = 0; i < data1.size(); i++) {
//		    sum += data1.get(i);
//		}
//
//		System.out.println(data1);
//		System.out.println(sum);

//      2. ABCDEF를 각각 문자 별로 출력
//		String str1 = "ABCDEF";
//		str1.chars().forEach((c) -> {
//			System.out.println((char)c);
//		});

//      3. ABDEF를 문자열로 출력
//		String str2 = "ABDEF";
//		String result = str2.chars()
//		    .mapToObj(c -> String.valueOf((char)c))
//		    .collect(Collectors.joining());
//
//		System.out.println(result);

//      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> data2 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100)
//			.filter((num) -> num % 2 != 0)
//			.forEach((num) -> data2.add(num));
//		System.out.println(data2);

//      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
//      Black, WHITE, reD, yeLLow, PINk
//		초기값을 알고 있을 때 : asList 사용하면 깔끔함
		ArrayList<String> data3 = new ArrayList<>();
		data3.add("Black");
		data3.add("WHITE");
		data3.add("reD");
		data3.add("yeLLow");
		data3.add("PINK");

		System.out.println(data3);
		data3.stream()
			.map((str) -> str.toLowerCase())
			.forEach((s) -> System.out.print(s + " "));
		
		System.out.println();
		
		long count = data3.stream()
			.map((str) -> str.toLowerCase())
			.filter((str) -> str.contains("a"))
			.count();
		
		System.out.println(count);

//      6. 첫 번째 문자가 대문자인 문자열만 출력
//      Apple, banana, Melon, tomato
//		ArrayList<String> data4 = new ArrayList<>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
//		
//		data4.stream()
//	    	.filter((str) -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
//	    	.forEach((str) -> {System.out.println(str);});

//      7. 한글을 정수로 변경
//      "공일이삼" -> "0123"
//		String hangle = "공일이삼사오육칠팔구";
//		String number = "0123456789";
//		String input = "공일이삼";
//
//		String result = input.chars()
//				.mapToObj((c) -> {
//					int index = hangle.indexOf((char) c);
//					System.out.println(index);
//					return String.valueOf(number.charAt(index));
//				}).collect(Collectors.joining());
//		
//		System.out.println(result);

//      8. 정수를 한글로 변경
//      "0123" -> "공일이삼"
//		String hangle = "공일이삼사오육칠팔구";
//		String number = "0123456789";
//		String input = "0123";
//
//		String result = input.chars().mapToObj((c) -> {
//			int index = number.indexOf((char) c);
//			return String.valueOf(hangle.charAt(index));
//		}).collect(Collectors.joining());
//		System.out.println(result);

	}
}
