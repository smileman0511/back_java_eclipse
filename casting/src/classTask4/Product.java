package classTask4;

public class Product {
	private String name;
	private int price;
	private int productCount;
	
	public Product() {;}

	public Product(String name, int price, int productCount) {
		this.name = name;
		this.price = price;
		this.productCount = productCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
}
