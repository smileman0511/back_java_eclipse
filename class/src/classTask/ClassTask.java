package classTask;

// 스포츠(Sports)
class Sports {
	String name; // 종목 이름
	int player; // 인원수 
	String ball; // 구종
	
// 	객체화 -> 기본 생성자, 초기화 생성자
//	기본 생성자 선언
	public Sports() {;}
	
//	초기화 생성자 선언
//	Shift + Alt + S -> O
	public Sports(String name, int player, String ball) {
		this.name = name;
		this.player = player;
		this.ball = ball;
	}
}

public class ClassTask {
	public static void main(String[] args) {
//		메모리에 할당을 하자 -> new Sports()
// 		농구(Basketball), 야구(Baseball), 축구(Soccer) 객체화
		Sports basketBall = new Sports("농구", 5, "농구공");
		Sports baseBall = new Sports("야구", 9, "야구공");
		Sports soccer = new Sports("축구", 11, "축구공");
	}
}