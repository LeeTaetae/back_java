package jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> addressMap = new HashMap<String, Object>();
		addressMap.put("street", "VIctor Plains");
		addressMap.put("suite", "Suite 879");
		addressMap.put("city", "Wisokyburgh");
		addressMap.put("zipcode", "90566 - 7771");
		addressMap.put("lat", "-43.9509");
		addressMap.put("lng", "-34.4618");
		
		JSONObject json = new JSONObject(addressMap);
		System.out.println(json);
	}
}
