package inheritanceTest;

class Animal {
	String name;
	
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("자기");
	}
	void poop() {
		System.out.println("배변 처리");
	}
	void walk() {
		System.out.println("걷기");
	}
	
}

class Person extends Animal {}
class Monkey extends Animal {}
class Cat extends Animal {}
class Snake extends Animal {
	
	@Override // @ -> 어노텐션
	void walk() {
		System.out.println("기어다니기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Person person = new Person();
		Monkey monkey = new Monkey();
		Cat cat = new Cat();
		Snake snake = new Snake();
		
		person.eat();
		person.sleep();
		person.poop();
		person.walk();
		
		monkey.eat();
		monkey.sleep();
		monkey.poop();
		monkey.walk();
		
		cat.eat();
		cat.sleep();
		cat.poop();
		cat.walk();
		
		
		snake.eat();
		snake.sleep();
		snake.poop();
		snake.walk();
		
		
	}
}












