package lambdaTask3;

public class LambdaTask3 {

	public static void main(String[] args) {
		// 1. 전달한 글자가 등장하는 거리 구하기
		// 입력예시
		// "abcdababefda", "a"
		//
		// 출력예시
		// "4 -> 2 -> 5"
		// 만약 중복된 글자가 없어 거리를 찾지 못하면
		// "-1"
		CharDistance cd = (str, ch) -> {
			String result = "";
			char[] chars = str.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == ch) {
					result += i;
				}
			}
			// 0 4 6 11
			String result2 = "";
			char[] chars2 = result.toCharArray();
			int[] arr = new int[result.length() - 1];
			for(int i = 0; i < result.length() - 1; i++) {
				arr[i] = chars2[i + 1] - chars2[i];
				result2 += arr[i];
				if(i < result.length() - 2) {
					result2 += " -> ";
				}
			}
			return result2;
		};

		System.out.println(cd.getCharDistance("abcdababefda", 'a'));

		//
		// 2. 스파이가 남긴 암호를 해독하시오.
		// 주어진 소문자(a~z) 범위라 가정한다.
		// 주어진 암호를 원래 문자열을 복원하시오.
		//
		// "1051081111181011069711897"
	}
}
