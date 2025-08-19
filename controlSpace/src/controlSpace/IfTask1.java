package controlSpace;

import java.util.Scanner;

public class IfTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "두 수를 입력하세요 \nex) 4, 5", num1 = "", num2 ="";
		int intNum1 = 0, intNum2 = 0;
		
		
		
		System.out.println(message);
		
		num1 = sc.next();
		num2 = sc.next();
		
		intNum1 = Integer.parseInt(num1);
		intNum2 = Integer.parseInt(num2);
		
		if(intNum1 < intNum2) {
			System.out.println("큰 값 : " + num2 + " 작은 값 : " + num1);
		} else if(intNum1 > intNum2) {
			System.out.println("큰 값 : " + num1 + " 작은 값 : " + num2);
		}else if(intNum1 == intNum2) {
			System.out.println("두 값이 같습니다.");
		}else {
			System.out.println("다시 입력하세요.");
		}
		
		
		
	}
}
