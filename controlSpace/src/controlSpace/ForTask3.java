package controlSpace;

import java.util.Scanner;

public class ForTask3 {
	public static void main(String[] args) {
		String alpabet = null , message = "알바벳을 소문자로 작성하세요.";
//		int count = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 7 == 0) {
//				count += i;
//			}
//		}
//		System.out.println(count);
		
//		a~z까지 반복해서 아래의 결과를 출력한다.
//		"aBcDeFg...Z"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		alpabet = sc.next();
		
		for(int i = 0; i < alpabet.length(); i++) {
			char alpa = alpabet.charAt(i);
//			String value = String.valueOf(alpa);
			if(i % 2 == 1) {
				System.out.print(Character.toUpperCase(alpa));
			}else if(i % 2 == 0) {
				System.out.print(alpa);
			}
			
		}
	}
}
