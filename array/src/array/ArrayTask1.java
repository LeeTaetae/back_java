package array;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
		String message = "5개의 숫자를 적으시오.";
		int min = 0, max = 0;
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력

//      1~10까지 배열에 담고 출력
//      1~100까지 배열에 담은 후 홀수만 출력
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//      A~F까지 배열에 담고 출력
//      A~F까지 중 C제외하고 배열에 담은 후 출력
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		
		
//		int[] arr1 = {10, 9, 8, 7, 6,5,4,3,2,1};
//		
//		for(int i = 0; i < arr1.length ; i++) {
//			if(i % 2 == 0) { System.out.print("" + arr1[i]);}
//		}
//		
//		int [] arr2 = new int[10];
//		for(int i = 0; i <= arr2.length; i++) {
//			System.out.println(i);
//		}
//		
//		int[] arr3 = new int[100];
//		for(int i = 0; i < arr3.length; i++) {
////			System.out.println(i+1);
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
//		
//		int count = 0;
//		int[] arr4 = new int[100];
//		for(int i = 0; i <= arr4.length; i++) {
//			if(i % 2 == 0) {
//				count += i;
//			}
//		}
//		System.out.println(count);
//		
//		String[] arr5 = {"ABCDE"};
//		for(int i = 0; i < arr5.length; i++) {
//			System.out.println(arr5[i]);
//		}
//		
//		char[] arr6 = {'A','B','C','D','E'};
//		for(int i = 0; i < arr6.length; i++) {
////			System.out.println(arr6[i]);
//			if(i == 2) continue;
//			System.out.print(arr6[i]);
//			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(message);
//		
//		int[] num2 = new int[5];
//		for(int i = 0; i < 5; i++) {
//			num2[i] = sc.nextInt();
//			System.out.println(num2[i]);
//			if(max < num2[i]) {
//				max = num2[i];
//			}
//			if(min > num2[i]) {min = num2[i];}
//		}
//		
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
//		
//		
		Scanner sc  = new Scanner(System.in);
		int[] arr7 = null;
		String message2="정수의 개수 : \nex)10";
		int total = 0, length= 0 ;
		double average = 0.0;
		
		System.out.println(message2);
		length = sc.nextInt();
		arr7 = new int[length];
		
		for(int i =0; i < arr7.length; i++) {
				
		}
		
		
	}
}
