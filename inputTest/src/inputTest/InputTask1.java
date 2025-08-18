package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "두 수를 입력하세요", str1 = null, str2 = null;
		int sub = 0, num1 = 0 , num2 = 0;
		
		System.out.println(message);
		System.out.print("1번 숫자 : ");
		str1 = sc.next();
		System.out.print("2번 숫자 : ");
		str2 = sc.next(); 
		
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		
		sub = num1 + num2;
		System.out.println("두 수의 합 : " + sub);
	}
}
	