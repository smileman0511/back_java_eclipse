package classTask4;

public class ClassTask4 {
	public static void main(String[] args) {
		Market market = new Market();
		
		Product snack = new Product("새우깡", 1500, 10);
		Product drink = new Product("코카콜라", 2000, 5);
		Product jelly = new Product("하리보", 2500, 3);
		Product gum = new Product("와우껌", 500, 10);
		Product ramyeon = new Product("신라면", 1000, 5);
		Product extra = new Product("초코파이", 3000, 5);
		
		System.out.println("--- 1. 상품 등록 테스트 ---");
        market.resisterProduct(snack);
        market.resisterProduct(drink);
        // 중복 등록 테스트
        market.resisterProduct(snack);
        market.resisterProduct(jelly);
        market.resisterProduct(gum);
        market.resisterProduct(ramyeon);
        // 6번째 상품 등록 (실패해야 함)
        market.resisterProduct(extra); 
		
		
		MarketMember member = new MarketMember("김회원", "010-1111-2222", 10000, 0, 0);
		MarketNonMember nonMember = new MarketNonMember("박비회원", "010-3333-4444", 5000, 0, 9);
		
		System.out.println("\n--- 2. 회원 구매 (30% 할인, 10% 포인트) ---");
		// 2500원 -> 1750원
		market.sellProduct(member, jelly);
        
        System.out.println("\n--- 3. 비회원 구매 (5% 할인, 5% 포인트, 쿠폰 지급) ---");
        // 1500원 -> 1425원, 쿠폰 1장 지급되어 10장 됨
        market.sellProduct(nonMember, snack);
        
        System.out.println("\n--- 4. 비회원 쿠폰 10장 무료 구매 테스트 ---");
        // 쿠폰 10장을 사용하여 무료 구매
        market.sellProduct(nonMember, drink);
        
        System.out.println("\n--- 5. 잔액 부족 테스트 ---");
        nonMember.setMoney(0);
        // 잔액 부족으로 실패
        market.sellProduct(nonMember, ramyeon);
	}
}
