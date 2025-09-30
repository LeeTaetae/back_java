package iterationStatement;

public class While {
	public static void main(String[] args) {
		
		
//		while(조건식) {
//			실행문;
//		}
		
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
