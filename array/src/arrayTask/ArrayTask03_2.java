package arrayTask;

import java.util.Scanner;

public class ArrayTask03_2 {
	public static void main(String[] args) {
//      골드 ~ 플레티넘
//      1. 비밀번호를 암호화해주는 로직을 완성하세요.
//      입력예시)
//      test123!@#

//      ? 이외의 특수문자가 나올 수 있음.
//      출력 예시)
//      ???????
		Scanner sc = new Scanner(System.in);
//		String password = null;
//		password = sc.nextLine();
//
//		for (int i = 0; i < password.length(); i++) {
//			System.out.println((char) (password.charAt(i) * 300));
//		}
		// 비밀번호 암호화는 다시 복구화를 하지 않는다.
		// salt, sha256 알고리즘 알아보기.

//      2. 가장 많이 판매된 상품의 총 판매 수익과
//      가장 적게 판매되 상품의 판매 수익의 차를 출력하세요.
//      아메리카노 2000원, 카페라떼 3000원, 에이드 4000원, 밀크쉐이크 5000원
		String[] menus = { "아메리카노", "카페라떼", "에이드", "밀크쉐이크" };
		int[] prices = { 2000, 3000, 4000, 5000 };
		int[] totalPrices = new int[4];
		int max = 0, min = 0;

//      orders의 정수는 menus의 주문 번호입니다.
		int[] orders = { 0, 1, 0, 1, 3, 1, 1, 2, 2, 0, 2, 3, 1, 2, 3, 0, 2, 2, 1, 1, 0 };
		for(int i = 0; i < orders.length; i++) {
			totalPrices[orders[i]] += prices[orders[i]];
		}
		
		max = totalPrices[0];
		min = totalPrices[0];
		
		for(int i = 0; i < totalPrices.length; i++) {
			if(max < totalPrices[i]) {
				max = totalPrices[i];
			}
			if(max > totalPrices[i]) {
				min = totalPrices[i];
			}
		}
		System.out.println(max - min);
	}
}
