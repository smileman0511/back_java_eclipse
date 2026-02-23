package classTask2;

public class HuntReward {
	public void huntReward(Reward reward) {
		if(reward instanceof OakReward) {
			OakReward oakRw = (OakReward)reward;
			oakRw.getOakReward();
		}
		else if(reward instanceof FairyReward) {
			FairyReward fairyRw = (FairyReward)reward;
			fairyRw.getFairyReward();
		}
		else if(reward instanceof HumanReward) {
			HumanReward humanRw = (HumanReward)reward;
			humanRw.getHumanReward();
		}
	}
}
