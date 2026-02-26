package arrayListTask1;

import java.util.ArrayList;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			datas.add((i + 1) * 10);
		}
		
		System.out.println(datas);
		
//		C: Create(추가) - 값을 추가
//		R: Read(읽기) = Get - 값을 가져오기
//		U: Update(수정) - 값을 수정
//		D: Delete(삭제) - 값을 삭제
		
//		1. 50뒤에 500을 삽입
		datas.add(datas.indexOf(50) + 1, 500);
		System.out.println("1번 : " + datas);
		 
		
//		2. 80 삭제 - 인덱스로 삭제하기
		if(datas.contains(80)) {
			datas.remove(datas.indexOf(80));
		}
		System.out.println("2번 : " + datas);
		
//		3. 80 삭제 - 값으로 삭제하기
		if(datas.contains(60)) {
//			Wrapper Class
			datas.remove(Integer.valueOf(60));
		}
		System.out.println("3번 : " + datas);
	}
}
