package methodPractice;

public class MethodPractice {
	
	void printName(String name, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
//		이름과 횟수를 입력받아서, 횟수만큼 이름을 출력하는 메소드
		MethodPractice mt = new MethodPractice();
		mt.printName("Java", 3);
	}
}
