package ex01;

public class Calculator {
// a) calcNum
// - 2개의 정수를 받아 두 정수의 더한 값을 출력해주는 기능을 메소드 구현
	public void calcNum(int num1, int num2) {
		int addResult = 0;
		addResult = num1 + num2;
		System.out.println(addResult);
	}
	
// b) calcNum
// - 1개의 실수와, 1개의 정수를 받아 덜한 결과값을 반환해 주는 기능을 가진 메서드 구현
	public double calcNum(double num1, int num2) {
		double addResult2 = 0;
		addResult2 = num1 + num2;
		return addResult2;
	}
	
// c) calcNum
// - 실수형 1개를 '매개변수'로 넘겨 받아 정수형으로 바꿔주고
// 결과값을 반환 (return) 해 주는 기능을 가진 메서드 구현
	public int calcNum(double num1) {
		int changeInt = (int) num1;
		return changeInt;
	}
	
// d) calcNum
// - 2개의 문자열을 받아 2개를 연결하고 연결된 하나의 문자열을 출력하는 기능을 가진 메서드
	public String calcNum(String str1, String str2) {
		String connectStr = str1 + str2;
		return connectStr;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.calcNum(1, 5);
		
		double resultSumDoubleAndInt = calc.calcNum(5.1, 2);
		System.out.println(resultSumDoubleAndInt);
		
		int resultChangeInt = calc.calcNum(5.5);
		System.out.println(resultChangeInt);
		
		String resultConnectStr = calc.calcNum("안녕", "하세요");
		System.out.println(resultConnectStr);
	}
}
