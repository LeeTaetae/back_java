package collectionTest;

import java.util.ArrayList;

public class ArrayListTest<T> {
// <?> : 제네릭 -  포괄적인 즉 이름이 없는이 라는 뜻
// 지금 당장 무슨 타입일 지 알 수 없을 때 사용하는 타입이다.
// 사용자가 어떤 타입의 데이터를 넣을지 모르기에 객체화할 떄 타입을 결정한다.
	
	
	T data;
  public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<String>();
		System.out.println(datas);
		
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		datas2.add(5);
		System.out.println(datas2);
	}
}
