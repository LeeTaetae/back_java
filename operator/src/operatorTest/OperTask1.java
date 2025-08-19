package operatorTest;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "숫자를 입력하세요." , num = null, intNum = "정수", dNum = "실수", intResult= "";
		int num1 = 0;
		double num2 = 0.0;
		
		
		System.out.println(message);
		num = sc.next();
		
		sc.close();
		
		
		num2 = Double.parseDouble(num);
		num1 = (int)num2;
		
		
		intResult = num2 - num1 == 0 ? intNum : dNum;
		
		
		System.out.println("입력 값 : " + num + " 이고 " + intResult + " 입니다.");
		
		
	}
}
