package hashSet.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ISTJ");
		mbtiType.add("ISTJ");
		mbtiType.add("ISTJ");
		mbtiType.add("ESTJ");
		mbtiType.add("ESTJ");
		mbtiType.add("ESTJ");
		mbtiType.add("ISTP");
		mbtiType.add("ISTP");
		mbtiType.add("ISTP");
		mbtiType.add("ISTP");
		
		System.out.println(mbtiType);
		
//		문법 or 
//		for(String mbti.mbtiType) {
//			System.out.println(mbti);
//		}
		
//		순서가 없을 때 순서를 붙여주는 인터페이스
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {
			String mbti = iter.next();
			if(mbti.equals("ESTJ")) {
				System.out.println(mbti);
			}
		}
		
		
	}
}
