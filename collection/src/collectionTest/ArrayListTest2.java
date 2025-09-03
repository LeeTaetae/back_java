package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		System.out.println(datas.size());
		// .add(값) 
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(70);
		datas.add(80);
		datas.add(20);
		datas.add(90);
		
//		System.out.println(datas);
		Collections.shuffle(datas);
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);
		}
		System.out.println(datas);
//		try {
//			datas.add(3, 500);
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("ArrayList 예외 발생");
//			System.out.println("올바른 작성법 요구바람");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		int prev = 0;
		try {
			if(datas.contains(90)) {
				prev = datas.set(datas.indexOf(90), 9);
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("올바른 인덱스 요구");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(datas);
//		
//		try {
//			datas.set(8, 9);
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("ArrayList 예외 발생");
//			System.out.println("올바른 작성법 요구");
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	//삭제
	// 80을 삭제
	// 1. 인덱스
		if(datas.contains(80)) {
			datas.remove(datas.lastIndexOf(80));
		}
		System.out.println(datas);
		
		//2. 값으로 삭제
		//	정수 -> 정수
		// Wrapper Class
		if(datas.contains(80)) {
			datas.remove(Integer.valueOf(80));
		}
		System.out.println(datas);
		
		
//		try {
//			datas.remove(6);		
//		}catch (IndexOutOfBoundsException e) {
//			System.out.println("ArrayList 예외 발생");
//			System.out.println("올바른 작성법 요구바람");
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(datas);
	
		
		try {
			System.out.println(datas.get(0));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayList2 예외 발생");
			System.out.println("인덱스 범위를 똑바로 작성하세요");
			e.printStackTrace();
		}catch ( Exception e) {
			e.printStackTrace();
		}
		
		//if the index is out of range(index < 0 || index >= size())
		
	}
}
