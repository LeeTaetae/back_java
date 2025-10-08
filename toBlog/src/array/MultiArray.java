package array;

import java.util.Arrays;

public class MultiArray {
	public static void main(String[] args) {
		
//		int[][] numbers = {
//				{1, 2, 3},
//				{4, 5, 6}
//		};
//		
//		for(int i = 0; i < numbers.length; i++) {
//			for(int j = 0; j < numbers[i].length; j++) {
//				System.out.print(numbers[i][j] + " ");
//			}
//			
//			System.out.println();
//		}
		
		
//		int[][] scores = {
//			{85, 90, 95},
//			{75, 95, 100},
//			{85, 75, 95}
//		};
//		
//		for(int i = 0; i < scores.length; i++) {
//			int sum = 0;
//			for(int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];
//			}
//			
//			double average = (double)sum / scores[i].length;
//			System.out.println((i + 1) + "반 평균 점수 : " +average);
//		}
		
		
		String[][] lunchMenus = {
				{"🍔", "🍗", "🥗"},
				{"🍙", "🧇", "🍞"}
		};
		
		System.out.println(lunchMenus[1][2]);
	}
}
