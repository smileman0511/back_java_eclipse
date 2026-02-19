package methodPractice;

public class MethodPractice04 {
	
	String whatKindLetter(char ch) {
		if(ch >= 65 && ch <= 91) {
			return "대문자";
		}
		else if(ch >= 97 && ch <= 122) {
			return "소문자";
		}
		else {
			return "다른 문자";
		}
	}
	
	public static void main(String[] args) {
//      1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
		MethodPractice04 mt = new MethodPractice04();
		System.out.println(mt.whatKindLetter('A'));
	}
}
