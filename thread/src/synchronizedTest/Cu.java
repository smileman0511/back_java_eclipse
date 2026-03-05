package synchronizedTest;

public class Cu {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread parent = new Thread(atm, "엄마");
		Thread child = new Thread(atm, "자식");
		
//		멀티쓰레드로 작동시키는 메서드 : .start()
		parent.start();
		child.start();
	}
}
