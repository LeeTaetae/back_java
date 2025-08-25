package randomTask;

import java.util.Random;

//* 로또 번호를 추첨하는 기능
//1. 반복되는 코드를 반복문으로
//2. 메서드로 생성
//3. 6개를 배열로 리턴
//4. 메인 메서드에서 사용 
//class Number {
//	int number;
//	int result;
//	
//	public Number() {;}
//	
//	public Number(int number) {
//		this.number = number;
//	}
//	
//	public Number(int number, int result) {
//		this.number = number;
//		this.result = result;
//	}
//	
//	Number getRandom(int[] arData) {
//		Number nu = new Number();
//		for (int i = 0; i < 99; i++) {
//			Random random = new Random();
//		}
//	}
//}

	

public class RandomTask {
	int[] getLottoNumbers() {
		Random random = new Random();
		int[] numbers = new int[6];
		for(int i = 1; i < 7; i++) {
			System.out.println(random.nextInt(6));
			numbers[i] = random.nextInt(6);
		}
		return numbers;
	}
	public static void main(String[] args) {
		RandomTask rt1 = new RandomTask();
		int[] numbers = rt1.getLottoNumbers();
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "");
		}
	}
	
}
