package array;

import java.util.Arrays;
import java.util.Comparator;

public class Array07 {
	public static void main(String[] args) {
		
		Integer[] arr = {1,6, 9, 10, 22, 33, 55, 44};
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println("내림차순 정렬 : " + Arrays.toString(arr));
	}
}
