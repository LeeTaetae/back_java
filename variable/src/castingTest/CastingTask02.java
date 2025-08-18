package castingTest;

public class CastingTask02 {
	public static void main(String[] args) {
		
		String num1 = "8.24", num2 = "7.8", num3 ="1";
		
		int dNum1 = (int)Double.parseDouble(num1);
		int dNum2 = (int)Double.parseDouble(num2);
		
//		int intNum1 = (int) dNum1;
//		int intNum2 = (int) dNum2;
		
		System.out.println(num3 + (dNum1 + dNum2));
		
	}
}
