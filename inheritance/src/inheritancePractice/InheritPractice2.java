package inheritancePractice;

class Computer {
	private String modelName;
	private int price;
	
	public Computer() {;}

	public Computer(String modelName, int price) {
		this.modelName = modelName;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void boot() {
		System.out.println("컴퓨터 부팅을 시작합니다.");
	}
}

class Laptop extends Computer {

	public Laptop(String modelName, int price) {
		super(modelName, price);
	}
	
	public void portableMode() {
		System.out.println("배터리를 사용하여 야외에서 작업합니다.");
	}
}

class HighEndLaptop extends Laptop {

	public HighEndLaptop(String modelName, int price) {
		super(modelName, price);
	}
	
	public void runHeavyApp() {
		System.out.println("무거운 개발 툴과 가상 머신을 실행합니다.");
	}
}

public class InheritPractice2 {
	public static void main(String[] args) {
		Laptop lt = new Laptop("갤럭시북 프로", 1_000_000);
		HighEndLaptop hel = new HighEndLaptop("제피러스 G16", 2_500_000);
		
		System.out.println("--- " + lt.getModelName() + " 테스트 ---");
		lt.boot();
		lt.portableMode();
		System.out.println();
		
		System.out.println("--- " + hel.getModelName() + " 테스트 ---");
		hel.boot();
		hel.portableMode();
		hel.runHeavyApp();
	}
}
