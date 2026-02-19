package classTest;

//	동물(Animal)
//	이름(name), 나이(age), 종류(species)
class Animal {
	String name;
	int age;
	String species;

//	1. 기본 생성자 -> 클래스를 만들면 기본 생성자를 항상 만들자.
	public Animal() {;}
	
//	2. 초기화 생성자 -> this가 없으면 초기화할 수 없다.
	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
}

// 토끼, 강아지, 고양이
public class ClassTest {
	public static void main(String[] args) {
//		메모리에 할당 -> new Animal() 
		Animal rabbit = new Animal("토깽이", 20, "토끼");
		Animal cat = new Animal("치즈", 3, "고양이");
		

	}
}
