package iterationStatement;

public class DoWhile {
	public static void main(String[] args) {
		
//		do {
//			실행문
//		} while (조건식);
		
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= 10);
		
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
