package streamTest.mapTest;

import java.util.ArrayList;
import java.util.Arrays;

public class MapTask1 {
	public String addRoot(String url) {
		return "/app" + url;
	}
	
	public static void main(String[] args) {
		ArrayList<String> datas1 = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand" ,"/rank"));
//		배열 하나에 값을 넣는다
//		String[] strs = {"/news", "/game", "/brand" ,"/rank"};
//		datas1.add("/news");
//		datas1.add("/game");
//		datas1.add("/brands");
//		datas1.add("/rank");
		
		
//		배열을 반복하면서 값을 ArrayList에 넣는다.
		
		
//		System.out.println(datas1);
		
//		ArrayList의 값 앞에 /app 을 추가하여 반복하면서 출력
		datas1.stream().map((n) -> "/app" + n ).forEach(System.out::println);
		
		MapTask1 mapTask = new MapTask1();
		datas1.stream().map(mapTask::addRoot).forEach(System.out::println);
		
		
	}
}
