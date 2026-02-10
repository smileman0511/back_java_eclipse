package castingTask;

public class CastingTask02 {
	public static void main(String[] args) {
//      "8.43" + 2.59를 더해서 10이 나오도록 출력하기
		String strNum = "";
		double doubleNum = 0.0;
		strNum = "8.43";
		doubleNum = 2.59;

		int result1 = (int) Double.parseDouble(strNum) + (int) doubleNum;
		System.out.println(result1);
		System.out.println("");

		double parsedNum = Double.parseDouble(strNum);
		int firstInt = (int) parsedNum;
		int secondInt = (int) doubleNum;

		int result2 = firstInt + secondInt;
		System.out.println(result2);
	}
}