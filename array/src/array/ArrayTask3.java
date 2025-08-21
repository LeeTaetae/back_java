package array;

public class ArrayTask3 {
	public static void main(String[] args) {
		int score = 0, average = 0, count = 0;
		
//		1. 1 ~ 20까지 짝수만 배열에 담고 배열안의 값에 모두 3을 더한 값으로 변경 후 출력하기
//			1) 1부터 20까지 반복문 돌리기
//			2) 그 중에 짝수 구하기
//			3) 배열에 넣기
//			4) 3을 더하기
		
		int[] arr1 = new int[20];
		for(int i = 1; i <= arr1.length; i++) {
			if(i % 2 == 0) {				
				System.out.println( i + 3);
			}
			
		}
		
		System.out.println("===================================");
		
//		2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
//			1) 초기값 정하기
//			2) 10~50까지 넣기
//			3) 각 값을 더해서 5로 나누기
		
		int[] scores = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < 5; i++) {
			score += scores[i];
		}
		
		average = score / 5;
		System.out.println("평균 : " + average);
		
		System.out.println("====================================");
//		3. 1 ~ 10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기
//			1) 1부터 10까지 배열에 담기
//			2) 값이 5보다 큰 값 구하기
//			3) 2배 하기
//			4) 출력하기
		
		int[] arr2 = new int[10];
		for(int i = 1; i <= arr2.length; i++) {
	
//			System.out.println(i);
			if(i > 5) {
				System.out.println(i * 2);
			}
		}
		
		System.out.println("=====================================");
//		4. 1 ~ 10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4...10 단, 마지막은 *이 붙지 않음
//			1) 1~10까지 배열에 담기
//			2) 모든 값에 * 붙이기
//			3) 마지막은 *이 붙지 않음 
		int[] arr3 = new int[10];
		for(int i = 0; i < arr3.length; i++) {
			String str1 = String.valueOf(i + 1);
			if(i+1 == 10) {
				System.out.print(str1);
			}else {
				System.out.print(str1 + "*");
			
			}
		
		}
		
		System.out.println("\n==================================");
//		5. 1 ~ 10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기
//			1) 1 ~ 10까지 배열에 담기
//			2) 3의 배수만 구하기
//			3) 모두 더하기
//			4) 더한 값만 출력하기
		int[] arr4 = new int[10];
		for(int i = 1; i <= arr4.length; i++) {

			if(i % 3 == 0) {
//				System.out.println(i);
				count += i;
			}
		}
		System.out.println("3의 배수 합 : " + count);	
	}
}
	
