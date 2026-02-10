package castingTask;

public class CastingTask03 {
	public static void main(String[] args) {
		// 'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기
		// 문자를 아스키코드 정수로 형변환
		// 거기에 32를 뺌
		// 32를 뺀 정수를 문자형으로 한 번 더 형변환

//		char upperA = 'a' - 32;
//		char upperJ = 'j' - 32;
//		char upperK = 'k' - 32; -> 이렇게도 형변환를 할 수 있다.

		char smallA = ' ', smallJ = ' ', smallK = ' ';
		char resultA = ' ', resultJ = ' ', resultK = ' ';
		int capitalA = 0, capitalJ = 0, capitalK = 0;
		String resultMsg = "";

		smallA = 'a';
		smallJ = 'j';
		smallK = 'k';

		capitalA = Character.valueOf(smallA) - 32;
		capitalJ = Character.valueOf(smallJ) - 32;
		capitalK = Character.valueOf(smallK) - 32;

		resultA = (char) (capitalA);
		resultJ = (char) (capitalJ);
		resultK = (char) (capitalK);

		resultMsg = "%c, %c, %c -> %c, %c, %c";

		System.out.printf(resultMsg, smallA, smallJ, smallK, resultA, resultJ, resultK);

	}
}