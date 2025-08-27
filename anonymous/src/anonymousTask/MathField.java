package anonymousTask;

public class MathField {
	public static void main(String[] args) {
		MathTask math = new MathTask() {
			
			@Override
			public void getName(String name) {
				System.out.println(name);
			}
			
			@Override
			public CalcResult calc(int num1, int num2) {
				CalcResult ca = new CalcResult(num1, num2);
				return ca;
			}
			
			@Override
			public int addSum(int num1, int num2) {
				int sub = 0;
				sub = num1 + num2;
				return sub;
			}
			
			@Override
			public String add(String str1, String str2) {
				String sub = str1 + str2;
				return sub;
			}
		};
		
		math.getName("이태희");
		System.out.println(math.add("조예성", " 바보"));
		System.out.println(math.addSum(10, 5));
		System.out.println("두 수의 합 : " + math.calc(20, 30).getAdd());
		System.out.println("두 수의 나눗셈 : " + math.calc(40, 50).getDivide());
		System.out.println("두 수의 곱 : " + math.calc(4, 20).getMulti());
		System.out.println("두 수의 뺄셈 : " + math.calc(10, 5).getMinus());
	}
}
