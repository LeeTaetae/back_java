package array;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {
		
//		int[] cards = {1, 4, 5, 7, 8, 9};
//		
////		배열의 깊은 복사
//		int[] newCards = Arrays.copyOf(cards, cards.length);
//		
//		System.out.println("cards 배열 : " + Arrays.toString(cards));
//		
////		cards 배열 값 변경
//		cards[1] = 2;
//		
//		System.out.println("cards 배열 : " + Arrays.toString(cards));
//		System.out.println("newCards 배열 : " + Arrays.toString(newCards));
		
		
//		int[] numbers = {1, 2, 3, 4, 5};
//		
//		int[] copy = Arrays.copyOf(numbers, 3);
//		
//		
//		System.out.println("원본 배열 : " + Arrays.toString(numbers));
//		System.out.println("복사본 배열 : " + Arrays.toString(copy));
		
		
		int[] origin = {10, 20, 30, 40, 50};
		int[] target = new int[origin.length];
		
		System.arraycopy(origin, 0, target, 0, origin.length);
		
		System.out.println("origin 배열 : " + Arrays.toString(origin));
		System.out.println("target 배열 : " + Arrays.toString(target));
		
	}
}
