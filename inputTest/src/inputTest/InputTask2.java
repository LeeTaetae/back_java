package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "0이상의 자연수를 3개 입력하세요.", str1 = null, str2 = null, str3 = null;
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		System.out.println(message);
		System.out.print("첫 번째 수 : ");
		str1 = sc.next();
		System.out.print("두 번쨰 수 : ");
		str2 = sc.next();
		System.out.print("세 번째 수 : ");
		str3 = sc.next();
		
		
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		num3 = Integer.parseInt(str3);
		sc.close();
		
		result = num1 * num2 * num3;
		
		System.out.println("세 정수의 곱 : " + result);
	}
}
