package anonymousTest;

//오픈
//역삼점
//- 아메리카노, 녹차라떼, 애플민트티
//
//신촌점
//- 아메리카노, 자몽허니블랙티, 자몽에이드
//
//1. 역삼점과 강남점은 아메리카노 무료행사 진행중
//2. 사용자가 sell() 메뉴를 판매하면 역삼점과 강남점의 아메리카노는 무료행사 진행중을 출력
//그 외 지점은 판매완료를 출력

public class Building {
	
	public static void main(String[] args) {
		GangNam gangnam = new GangNam();
		JamSil jamsil = new JamSil();
		YeokSam yeoksam = new YeokSam();
		SinChon sinchon = new SinChon();
		
		gangnam.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "녹차라떼", "바닐라 콜드브루"};
			}
		});
		
		jamsil.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "에이드", "애플민트티"};
			}
		});
		
		yeoksam.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "녹차라떼", "자몽에이드"};
			}
		});
		
		sinchon.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "자몽허니블랙티", "자몽에이드"};
			}
		});
		
		gangnam.sell("에이드", gangnam);
		jamsil.sell("아메리카노", jamsil);
		yeoksam.sell("아메리카노", yeoksam);
		sinchon.sell("아메리카노", sinchon);
		
		
		
		
		
		
	}
}
