package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayList2 {
	
	public static void main(String[] args) {
		// a ~ z까지 문자열로 ArrayList에 추가하기
		ArrayList<String> datas = new ArrayList<String>();
		for(int i = 97; i <= 122; i++) {
			datas.add(String.valueOf((char)i));
		}
		System.out.println(datas);
		
		for(int i = 0; i < datas.size(); i++) {
			if(i % 2 == 1) {
				System.out.print(datas.get(i).toUpperCase());
				continue;
			}
			System.out.print(datas.get(i));
			
		}
	}
}
