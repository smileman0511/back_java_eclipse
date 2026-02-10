package operTask;

import java.util.Scanner;

public class OperTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 수학점수, 영어점수, 국어점수를 입력 받고,
		int kor = 0, math = 0, eng = 0, total = 0;
		double avg = 0.0;
		String resultAvg = "", resultPass = "", resultNotPass = "", resultRetry = "", resultMsg = "";
		System.out.println("국어, 수학, 영어 점수를 입력하세요.\nex) 90 88 100");
		
		kor = sc.nextInt();
		math = sc.nextInt();
		eng = sc.nextInt();
		
		// 총점과 평균을 구한다.
		total = kor + math + eng;
		avg = total / 3.0;
		
		// 평균이 60점 초과면 합격, 60점 미만이면 불합격, 60점이면 재평가를 출력
		// 단 if문을 사용하지 않는다.
		resultPass = "합격";
		resultNotPass = "불합격";
		resultRetry = "재평가";
		
		resultAvg = avg > 60 ? resultPass : 
			avg < 60 ? resultNotPass : resultRetry;
		
		resultMsg = "평균은 %.2f점으로 %s입니다.";
		
		// 평균은 소수점 2번째 자리까지만 표기한다.
		System.out.printf(resultMsg, avg, resultAvg);
	}
}
