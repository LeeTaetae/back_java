package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTask1 {
//	HashMap 자료구조 이용
//	"street " : "VIctor Plains
//	"suite" : "Suite 879"
//	"city" : "Wisokyburgh"
//	"zipcode" : "90566 - 7771"
//	"lat" : "-43.9509"
//	"lng" : "-34.4618"
	public static void main(String[] args) {
		HashMap<String, Object> addressMap = new HashMap<String, Object>();
		addressMap.put("street", "VIctor Plains");
		addressMap.put("suite", "Suite 879");
		addressMap.put("city", "Wisokyburgh");
		addressMap.put("zipcode", "90566 - 7771");
		addressMap.put("lat", "-43.9509");
		addressMap.put("lng", "-34.4618");
		
		

		ArrayList<Object> addressMapArr = new ArrayList<Object>(addressMap.values());
		System.out.println(addressMapArr);
//		
//		Iterator<Entry<String, Object>> addressIter = addressMap.entrySet().iterator();
//		while(addressIter.hasNext()) {
//			Entry<String, Object> entry = addressIter.next();
//			Object entries = entry.getValue();
////			System.out.println(entries);
//			
//			addressMapArr.add(entries);
//		}
		
//		ArrayList<Entry<String, Object>> addressMapArr = new ArrayList<Entry<String, Object>>();
//		System.out.println();
		
//		System.out.println(addressMapArr);
		
	
	}
}
