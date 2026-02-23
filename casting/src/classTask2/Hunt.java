package classTask2;

public class Hunt {
//	Monster monster -> 업캐스팅
	public void huntMonster(Monster monster) {
		if(monster instanceof Oak) {
			Oak oak = (Oak)monster;
			oak.huntOak();
		}
		else if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.huntFairy();
		}
		else if(monster instanceof Human) {
			Human human = (Human)monster;
			human.huntHuman();
		}
	}
}
