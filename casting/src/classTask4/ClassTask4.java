package classTask4;

import java.util.Scanner;

public class ClassTask4 {
	public static void main(String[] args) {
		Market market = new Market();
		
		Product snack = new Product("새우깡", 1500, 10);
		Product drink = new Product("코카콜라", 2000, 5);
		Product jelly = new Product("하리보", 2500, 3);
		Product gum = new Product("와우껌", 500, 10);
		Product ramyeon = new Product("신라면", 1000, 5);
		
		market.resisterProduct(snack);
		market.resisterProduct(drink);
		
		MarketMember member = new MarketMember("김회원", "010-1111-2222", 10000, 0, 0);
		MarketNonMember nonMember = new MarketNonMember("박비회원", "010-3333-4444", 100, 0, 0);
		
		System.out.println("\n--- 회원 구매 ---");
		market.sellProduct(member, jelly);
		
		System.out.println("\n--- 비회원 구매 ---");
		market.sellProduct(nonMember, snack);
		
		System.out.println("\n--- 잔액 부족 ---");
		nonMember.setMoney(0);
		market.sellProduct(nonMember, drink);
	}
}
