package castingTest;

public class CastingTast01 {
	public static void main(String[] args) {
		
		System.out.println((int)8.43 + (int)2.59);
		
		int num1 =(int) 8.43;
		int num2 = (int) 2.59;
		int sub = num1 + num2;
		System.out.println(sub);
		
		
		double num3 = 8.43, num4 = 2.59;
		
		int result = (int)num3 + (int)num4;
		System.out.printf("%.2f + %.2f = %d로 강제 형 변환", num3, num4, result);
		
		System.out.println('A' * 100);
			
	}
}
