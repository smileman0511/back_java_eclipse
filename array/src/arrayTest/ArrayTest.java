package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
//		int[] arData = new int[5]; 
		// new -> 정수형 배열을 heap 메모리 영역에 만들어라.
		// new에는 int[5] 배열의 전체 바구니의 주소가 담겨있다.
		// arData를 출력하면 arData의 해시 주소가 출력된다.

		// 클래스의 자료형의 주소의 초기값은 null로 들어간다.

		int[] arData1 = { 10, 3, 9, 6, 7 };
		
		// . -> 주소 접근 연산자
		// length는 arData1의 필드이다.
		for(int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
	}
}
