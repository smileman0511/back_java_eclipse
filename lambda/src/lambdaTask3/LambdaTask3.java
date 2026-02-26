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
            int lastIndex = -1;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch.charAt(0)) {
                    if (lastIndex != -1) {
                        if (!result.isEmpty()) {
                            result += " -> ";
                        }
                        result += (i - lastIndex);
                    }
                    lastIndex = i;
                }
            }

            if (result.isEmpty()) {
                return "-1";
            }
            return result;
        };

        System.out.println(cd.getCharDistance("abcdababefda", "a"));

		//
		// 2. 스파이가 남긴 암호를 해독하시오.
		// 주어진 소문자(a~z) 범위라 가정한다.
		// 주어진 암호를 원래 문자열을 복원하시오.
		//
		// "1051081111181011069711897"
        
        
	}
}
