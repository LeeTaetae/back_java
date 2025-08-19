package controlSpace;

import java.util.Scanner;

public class SwitchTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "몇월인가요?", seasonMessage = null;
		int month = 0, season = 0;;
		
		
		System.out.println(message);
		
		month = sc.nextInt();
		if(season >= 13) {
			System.out.println("월을 정확하게 기입하세요.");
		}
		season = month / 3 % 4;
		
		switch(season) {
		case 0 : 
			seasonMessage = month + "월은 겨울입니다.";
//			System.out.println(seasonMessage);
			break;
		case 1 : 
			seasonMessage = month + "월은 봄입니다.";
//			System.out.println(seasonMessage);
			break;
		case 2 :
			seasonMessage = month + "월은 여름입니다.";
//			System.out.println(seasonMessage);
			break;
		case 3 : 
			seasonMessage = month + "월은 가을입니다.";
//			System.out.println(seasonMessage);
			break;
		default :
			break;
		}
		
		   System.out.println(seasonMessage);
		
//		System.out.println(month);
//		
//		switch(month) {
//		case  3,4,5 : 
//			System.out.println(month +"월은 봄입니다.");
//			break;
//		case 12, 1, 2 :
//			System.out.println(month +"월은 겨울입니다.");
//			break;
//		case 6,7,8 :
//			System.out.println(month +"월은 여름입니다.");
//			break;
//		case 9,10,11 :
//			System.out.println(month +"월은 가을입니다.");
//			break;
//		default : 
//			System.out.println("달을 정확하게 기입하세요.");
//			break;
//		
//		}
	}
}
