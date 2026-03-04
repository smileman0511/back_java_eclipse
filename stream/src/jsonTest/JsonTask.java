package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTask {
	public static void main(String[] args) {
//      "/news", "/game", "/brand", "/rank"
//      위 4개 경로를 모두 ArrayList에 추가하고,
//      경로 앞에 "/app"을 붙인 뒤
//      JSONArray로 변경하기
		
//		ArrayList에 추가하기
		ArrayList<Path> path = new ArrayList<Path>(
				Arrays.asList(
					new Path("/news"),
					new Path("/game"),
					new Path("/brand"),
					new Path("/rank")
				)
			);
		
		JSONObject pathJSON = new JSONObject();
		JSONArray pathsJSON = new JSONArray();
		
		path
			.stream()
			.map(p -> {
                p.setPath("/app" + p.getPath());
                return p;
            })
			.map(paths -> new JSONObject(paths))
			.forEach(jsonObj -> pathsJSON.put(jsonObj));
		
		System.out.println(path);
		
		
		
		
		
		
		
	}
}