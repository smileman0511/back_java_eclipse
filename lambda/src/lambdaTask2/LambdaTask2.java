package lambdaTask2;

public class LambdaTask2 {
	public static void main(String[] args) {
//      1) 문자열과 정수형을 전달하면 정수형마다 
//	   	글자를 건너뛰고 반환(리턴)하는 메서드
//      입력 예시)
//      "abcdabcd", 4
//      출력 예시
//      "abcabc"
		JumpIndexInt jii = (str, num) -> {
			String result = "";
			char[] chars = str.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				if ((i + 1) % num != 0) {
					result += chars[i];
				}
			}
			return result;
		};
//		System.out.println(jii.jumpInt("abcdabcd", 4));

//      2) 문자열과 문자형을 전달하면 찾은 문자열의 
//		인덱스에 해당하는 글자를 반환(리턴) 메서드
//      없을 시 -1
//      "abcdabcd", 'a'
//      출력 결과
//      "c"
		GetIndexValue giv = (str, ch) -> {
			int count = 0;
			char[] chars = str.toCharArray();
			for(int i = 0; i < chars.length; i++) {
				if(chars[i] == ch) {
					count++;
				}
			}
			if(count == 0) {
				return "-1";
			}
			else {
				return String.valueOf(chars[count]);
			}
			
		};
		
//		System.out.println(giv.getIdxValue("abcdabcd", 'a'));


//      3) 문자열에서 중복된 값을 모두 없애고 반환(리턴)하는 메서드
//      입력 예시
//      "가나다라마바사가나다라가나다"
//      출력 예시
//      "가나다라마바사"
		RemoveOverLap rol = (str) -> {
			String result = "";
			char[] chars = str.toCharArray();
			for(int i = 0; i < chars.length; i++) {
				if(!result.contains(String.valueOf(chars[i]))) {
					result += chars[i];
				}
			}
			
			return result;
		};
		
//		System.out.println(rol.removeOverLap("가나다라마바사가나다라가나다"));

//      4) 문자열을 전달하면 문자열을 뒤집어서 리턴(반환)해주는 메서드
//      입력 예시
//      "123456789"
//      출력 예시
//      "987654321"

		ReverseNumber rn = (str) -> {
			String result = "";
			char[] chars = str.toCharArray();
			for(int i = 0; i < chars.length; i++) {
				result += chars[chars.length - i - 1];
			}
			return result;
		};
		
		System.out.println(rn.reverseNum("123456789"));
	}
}
