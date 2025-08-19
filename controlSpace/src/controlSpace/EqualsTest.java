package controlSpace;

import java.util.Scanner;

public class EqualsTest {
//	문자열 메서드
//	.equals() : 문자열 값끼리 비교하는 메서드
//	 == : 주소를 비교하는 연산자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      String message = "점심메뉴를 입력하세요. \nex)잘하는 배승원의 베스트 메뉴!",
	            menu = null;
	      System.out.println(message);
//	      sc.next() : new String(input)
	      menu = sc.next();
	      
	      if(menu.equals("백반")) {
	         System.out.println("오늘의 점심");
	      }else if(menu.equals("돈까스")) {
	         System.out.println("어제 먹은 돈까스 질림!");
	      }else if(menu.equals("짜장면")) {
	         System.out.println("잘하는 배승원의 베스트 짜장면 컨펌!");
	      }else if(menu.equals("우동")) {
	         System.out.println("통통한 우동! 잘하는 배승원의 먹킷리스트!");
	      }else if(menu.equals("해장국")) {
	         System.out.println("어제도 오늘도 해장국! 잘하는 배승원!");
	      }else if(menu.equals("샐러드")) {
	         System.out.println("잘하는 배승원 컨펌!");
	      }else {
	         System.out.println("잘하는 배승원 다이어트중!");
	      }
	   }
	}

