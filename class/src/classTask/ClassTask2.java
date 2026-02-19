package classTask;

import java.util.Scanner;

// 슈퍼카(SuperCar) 클래스 생성
// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴(엔진 트루), 엔진을 끔(엔진 뻘스)
class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine;
	int password;
	static int wrongCount;

	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, boolean engine, int password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = engine;
		this.password = password;
	}
	
	void engineOnOff(int password) {
		if(this.password == password) {
			engine = true;
			System.out.printf("%s %s. 엔진 켜짐\n", this.color, this.brand);
		}
		else {
			System.out.println("비밀번호 오류. 엔진 안켜짐. 오류 횟수 + 1");
			wrongCount++;
		}
	}
	
	void policeOn() {
		if(wrongCount >= 3) {
			System.out.println("비밀번호 오류 3회 이상. 경찰 출동");
			wrongCount = 0;
		}
	}

}

public class ClassTask2 {

	public static void main(String[] args) {
//   1. 슈퍼카 객체화
		SuperCar ferrari = new SuperCar("페라리", "빨강", 200, false, 1234);
		
//   2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			String message = "비밀번호를 입력하세요.\nex) 1234";
			int password = 0;
			System.out.println(message);
			password = sc.nextInt();
			
			ferrari.engineOnOff(password);
			
//   3. 비밀번호 3회 오류시 경찰 출동
			ferrari.policeOn();

		}
		
	}

}