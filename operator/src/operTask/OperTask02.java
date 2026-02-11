package operTask;
import java.util.Scanner;
public class OperTask02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고양이, 소, 강아지, 고라니 중 동물 1개를 입력하세요.");
		String animal = "", cat = "고양이", cow = "소", dog = "강아지", gora = "고라니",
				catMsg = "고양이를 좋아하는 당신은 대훈이의 러버입니다.",
				cowMsg = "소를 좋아하는 당신은 세종이의 단짝입니다.",
				dogMsg = "강아지를 좋아하는 당신은 민균이의 짝사랑입니다.",
				goraMsg = "고라니를 좋아하는 당신은 미쳤습니다.",
				wrongMsg = "잘못 입력하셨습니다.",
				resultMsg = "";
		
		animal = sc.next();
		
		resultMsg = animal.equals(cat) ? catMsg 
				: animal.equals(cow) ? cowMsg 
					: animal.equals(dog) ? dogMsg 
						: animal.equals(gora) ? goraMsg
							:wrongMsg;
		
		System.out.println(resultMsg);
	}
}