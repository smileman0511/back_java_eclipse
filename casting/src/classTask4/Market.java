package classTask4;

public class Market {
	private String name;
	private String[] productList = new String[5];
	private int productCount;

	public Market() {
		;
	}

	public Market(String name, String[] productList, int productCount) {
		this.name = name;
		this.productList = productList;
		this.productCount = productCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getProductList() {
		return productList;
	}

	public void setProductList(String[] productList) {
		this.productList = productList;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

//  1. 상품 판매
	public void sellProduct(Customer customer, Product product) {
//  	1번 조건 - 등록된 상품만 판매할 수 있다.
//		등록된 상품인지 아닌지 검수 과정 필요 -> boolean
		boolean isRegistered = false;
		for (int i = 0; i < productCount; i++) {
//			.equals()사용
			if (productList[i].equals(product.getName())) {
				isRegistered = true;
				break;
			}
		}
//		등록되지 않은 상품일 때
		if (!isRegistered) {
			System.out.println("등록되지 않은 상품입니다.");
			return;
		}
//		재고가 없을 때
		if (product.getProductCount() <= 0) {
			System.out.println(product.getName() + "의 재고가 부족합니다.");
			return;
		}
//  	2번 조건 - 유저가 가진 돈보다 적으면 판매할 수 없다.
//		돈이 부족할 때
		if (customer.getMoney() < product.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
//  	- 유저가 마다의 할인율이 적용된다.
//     	1. 비회원 할인율 5% 적용
//     	2. 멤버 할인율 30% 적용
//  	- 등록된 상품의 재고보다 작으면 판매할 수 없다.
	}

//	2. 상품 등록
	public void resisterProduct(Product product) {
		if (productCount >= productList.length) {
			System.out.println("더 이상 상품을 등록할 수 없습니다. (최대 5개)");
			return;
		}
		productList[productCount] = product.getName();
		productCount++;
		System.out.println("[상품 등록 완료] " + product.getName() + " 이(가) 상품 목록에 등록되었습니다.");
	}

//	3. 포인트 적립
	public void pointSave() {

	}

//	4. 비회원 쿠폰 이벤트
	public void nonMemberCouponEvent() {

	}

}
