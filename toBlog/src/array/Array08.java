package array;

import java.util.Arrays;

public class Array08 {
	public static void main(String[] args) {
		
//		int[] arr1 = {1, 2, 3};
//		
////		배열의 얕은 복사
//		int[] arr2 = arr1;
//		
//		System.out.println("arr1 배열 : " + Arrays.toString(arr1));
//		
//		
////		arr2 배열 값 변경
//		arr2[1] = 10;
//		
//		System.out.println("arr2 배열 : " + Arrays.toString(arr2));
//		System.out.println("arr1 배열 : " + Arrays.toString(arr1));
		
		
		
		
		int[] cards = {1, 6, 3, 2};
		int[] newCards = new int[cards.length];
		
//		새로운 배열에 기존 내용 삽입
		for(int i = 0; i < cards.length; i++) {
			newCards[i] = cards[i];
		}
		
		newCards[1] = 7;
		
		System.out.println("cards 배열 : " + Arrays.toString(cards));
		System.out.println("newCards 배열 : " + Arrays.toString(newCards));
		
	}
}
