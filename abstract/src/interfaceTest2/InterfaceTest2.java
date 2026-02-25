package interfaceTest2;

public class InterfaceTest2 {
//	초식동물이 들어오면 채소를 먹이로 주기
//	육식동물이 들어오면 고기를 먹이로 주기
//	출력
	public void checkAnimal(Animal animal) {
		
		if(animal instanceof HerbivoreMarker) {
//		초식동물
			this.feedHerbivore((HerbivoreMarker)animal);
		}
		else if(animal instanceof CarnivoreMarker) {
//		육식동물
			this.feedCarnivore((CarnivoreMarker)animal);
		}
	}
	
//	업캐스팅
	public void feedCarnivore(CarnivoreMarker carnivoreMarker) {
		System.out.println("규혁이 던짐");
	}
	
	public void feedHerbivore(HerbivoreMarker herbivoreMarker) {
		System.out.println("채소를 던짐");
	}
	
	public static void main(String[] args) {
		InterfaceTest2 lab = new InterfaceTest2();

//		그룹으로 묶어줄 필요가 있다? -> 인터페이스 찾아가기
		
		Bear bear = new Bear();
		Deer deer = new Deer();
		
		lab.checkAnimal(bear);
		lab.checkAnimal(deer);
		
		
		
		
		
		
		
		
	}
}








