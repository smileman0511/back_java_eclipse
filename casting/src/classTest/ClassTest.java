package classTest;

// 부모
class Car {
	public Car() {;}
	
	void engineStart() {
		System.out.println("열쇠로 시동을 킴");
	}
}

// 자식
class SuperCar extends Car {
	public SuperCar() {;}
	
//	부모의 코드
	void engineStart() {
		System.out.println("음성으로 시동을 킴");
	}
	
//	자식만의 코드
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
}

public class ClassTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		업캐스팅 - 자식 SuperCar가 부모 Car에 들어감
		Car noOptionFerrari = new SuperCar();
		
//		오버라이딩된 자식꺼가 나옴.
//		업캐스팅 객체와 부모의 객체는 다르다.
//		- 오버라이딩된 메서드의 결과가 다르다.
		matiz.engineStart();
		noOptionFerrari.engineStart();
		
//		error
//		SuperCar fullOptionFerrari = new Car();
//		업캐스팅된 SuperCar를 다운캐스팅함.
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
		
		
	}
}







