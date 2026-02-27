package hashMap.task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTask {
	public static void main(String[] args) {
		HashMap<String, Object> userData = new HashMap<String, Object>();

		userData.put("hobby1", "코딩");
		userData.put("hobby2", "잠자면서 코딩");
		userData.put("hobby3", "자기 전에 코딩");
		userData.put("hobby4", "밥먹으면서 코딩");
		userData.put("hobby5", "운동하면서 코딩");
		userData.put("hobby6", "하드 코딩");
		userData.put("hobby7", "바이브 코딩");
		userData.put("hobby8", "취중 코딩");
		userData.put("hobby9", "수면 코딩");
		userData.put("hobby10", "유중 코딩");

//      userData의 value 중 "운동" 또는 "수면" 또는 "유중"이 들어간 
//      key 이름을 모두 출력하시오 

		Iterator<Entry<String, Object>> userIter = userData.entrySet().iterator();

        while (userIter.hasNext()) {
            Entry<String, Object> entry = userIter.next();
            String value = (String)entry.getValue();
            
            if (value.contains("운동") || value.contains("수면") || value.contains("유중")) {
                System.out.println(entry.getKey() + " : " + value);
            }
        }

	}
}
