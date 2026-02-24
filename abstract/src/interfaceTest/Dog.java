package interfaceTest;

public class Dog implements Pet{
	@Override
	public void poop() {
		System.out.println("밖에서");
	}
	@Override
	public void sitDown() {
		System.out.println("앉아");
	}
	@Override
	public void waitNow() {
		System.out.println("기다려");
	}
}
