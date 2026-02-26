package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {

		int[] arData = new int[3];
		int num = 0;

		try {
			System.out.println(arData[10] / num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 벗어남!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("예외가 발생하든, 발생하지 않든 무조건 실행되는 메서드");
		}
	}
}
