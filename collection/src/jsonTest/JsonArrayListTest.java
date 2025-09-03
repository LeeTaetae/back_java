package jsonTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayListTest {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		
		JSONArray usersJSON = new JSONArray(users);
//		System.out.println(usersJSON);
		JSONObject userJson = new JSONObject();
		
		
		User user1 = new User(1L, "홍길동", 17, "개발자");
		User user2 = new User(2L, "장보고", 20, "기획자");
		User user3 = new User(3L, "이순신", 35, "디자이너");
		User user4 = new User(4L, "이성계", 42, "개발자");
		User user5 = new User(5L, "이태희", 22, "사장");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		System.out.println(users);
		for(Object user : users) {
			userJson = new JSONObject(user);
			usersJSON.put(userJson);
		}
		System.out.println(usersJSON);
		
		for(int i = 0; i < users.size(); i++) {
			usersJSON.put(new JSONObject(users.get(i)));
		}
		System.out.println(usersJSON);
		
		users.forEach((data) -> {
//			System.out.println(data);
		});
		
		users.stream().map(JSONObject::new).forEach(usersJSON::put);;
		System.out.println(usersJSON);
	}
}
