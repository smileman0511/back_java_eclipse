package classTask2;

import java.util.Scanner;

class Information {
//	1. private 붙이기
	private String name;
	private String job;
	
//	2. 기본 생성자 선언
	public Information() {;}

//	3. 초기화 생성자 선언
	public Information(String name, String job) {
		this.name = name;
		this.job = job;
	}

//	4. getter, setter 만들기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void pickCharacter() {
		System.out.println("캐릭터 선택 완료");
	}
}

//게임 시스템
//캐릭터는 몬스터를 사냥할 수 있다.
//몬스터
//오크, 요정, 휴먼
//오크를 사냥하면 
//"오크가 달려든다!"를 출력 +@
//"가죽 얻는다"를 출력

//요정을 사냥하면
//"요정이 마법을 사용한다"를 출력 +@
//"날개를 얻는다"를 출력

//휴먼을 사냥하면
//"휴먼이 숨는다"를 출력 +@
//"갑옷을 얻는다"를 출력

//while 문에서 1 2 3으로 사냥할 대상 선택 고르기
//반복 돌리기. 0 누르면 빠져나가기
//
//캐릭터
//- 이름
//- 직업
//
//몬스터
//- 오크, 요정, 휴먼으로 묶기 가능?
//
//얻는 물건도 묶기 가능?

public class ClassTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Information infor = new Information("zl존칼선생", "검사");
		System.out.print("[" + infor.getName() + " - 직업: " + infor.getJob() + "] ");
		infor.pickCharacter();
		
		Hunt hunt = new Hunt();
		HuntReward hr = new HuntReward();

		while(true) {
			System.out.println("사냥할 몬스터를 선택하세요.\n1. 오크\n2. 요정\n3. 휴먼\n4. 나가기");
			int pick = sc.nextInt();
			if(pick == 1) {
				hunt.huntMonster(new Oak());
				hr.huntReward(new OakReward());
				System.out.println();
			}
			else if(pick == 2) {
				hunt.huntMonster(new Fairy());
				hr.huntReward(new FairyReward());
				System.out.println();
			}
			else if(pick == 3) {
				hunt.huntMonster(new Human());
				hr.huntReward(new HumanReward());
				System.out.println();
			}
			else if(pick == 4) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			else {
				System.out.println("다시 입력해주세요.");
				System.out.println();
			}
		}
		
		
		
		
		
		
	}

}









