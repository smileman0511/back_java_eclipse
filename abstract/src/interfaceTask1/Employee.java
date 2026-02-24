package interfaceTask1;

public abstract class Employee implements Person{
	@Override
	public void eat() {
		System.out.println("밥먹기");
	}

	@Override
	public void goToWork() {
		System.out.println("회사가기");
	}
}
