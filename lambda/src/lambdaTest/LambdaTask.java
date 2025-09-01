package lambdaTest;

import lambdaTest.LambdaInter2;

public class LambdaTask {
	//사칙연산의 결과를 출력하는 메서드
	public void showClacResult(CalcResult calc) {
//		CalcResult calc = new CalcResult();
//		calc.setSub(num1 + num2);
//		calc.setMinus((num1 > num2 ? num1 - num2 : num2 - num1));
//		calc.setDivide((num1 > num2 ? num1 / num2 : num2 / num1));
//		calc.setMulti(num1 * num2);
		System.out.println("두 수의 합 : " + calc.getSub());
		System.out.println("두 수의 차 : " + calc.getMinus());
		System.out.println("두 수의 곱 : " + calc.getMulti());
		System.out.println("두 수의 나눗셈 : " + calc.getDivide());
	}
	public static void main(String[] args) {
		LambdaTask lambda = new LambdaTask();
		LambdaInter2 lambdaInter2 = (num1, num2) -> {CalcResult calc = new CalcResult();
		calc.setSub(num1 + num2);
		calc.setMinus((num1 > num2 ? num1 - num2 : num2 - num1));
		calc.setDivide((num1 > num2 ? num1 / num2 : num2 / num1));
		calc.setMulti(num1 * num2);
		return calc;};
		
		lambda.showClacResult(lambdaInter2.calc(10, 20));
		
//		System.out.println(lambdaInter2.calc(10, 20).getSub());
//		System.out.println(lambdaInter2.calc(10, 20).getMinus());
//		System.out.println(lambdaInter2.calc(10, 20).getDivide());
//		System.out.println(lambdaInter2.calc(10, 20).getMulti());
		
		
	}
}
