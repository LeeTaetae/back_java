package collectionTest.hashSetTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id","taehee");
		userMap.put("password","0308");
		userMap.put("name","이태희");
		userMap.put("age",20);
		userMap.put("isRich",true);
//		
//		System.out.println(userMap);
//		System.out.println(userMap.get("age"));
//		System.out.println(userMap.entrySet());
		
		Iterator<Entry<String, Object>> userMapInter = userMap.entrySet().iterator();
		while(userMapInter.hasNext()) {
//			System.out.println(userMapInter.next());
			Entry<String, Object> entry = userMapInter.next();
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
	}
}
