package forContainer;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		int  result = 0;
		String num1 = null;
	  for(int i = 1; i <= 100; i++) {
		  if(i % 3 == 0 && i % 5 == 0) {
			  System.out.println(i);
		  }
	  }
	  
//	  Scanner sc = new Scanner(System.in);
//	  
//	  System.out.println("0~9까지 숫자 주새요");
//	  
//	  num1 = sc.next();
//	  
//	  for(int i = num1.length() - 1; i >= 0; i--) {
//		 System.out.println(num1.charAt(i));
//	  }
	  
//	  System.out.println(num1);
	  
	  String a = "Programming";
	  char ch = ' ';
	  int count = 0;
	  for(int i = 0; i < a.length(); i++) {
		  ch = a.charAt(i);
//		  System.out.println(ch);
		  if(String.valueOf(ch).equals("g")) {
			  count++;
		  }
	  }
	  System.out.println(count);
	}
}
