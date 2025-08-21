package array;

import java.util.Scanner;

//오늘 점심 
//1. 알고리즘 제출

public class ArrayTask2 {
public static void main(String[] args) {
//   배열 활용
//   1. 사용자에게 입력받은 문자열 중 
//   글자를 하나씩 들고와야함! .charAt(인덱스)
//   배열에 담았다!
   
//   소문자는 모두 대문자로,
//   만약 'a' -> 'A' 바꾼다면 'a' 97이고, 'A' 65이니까,
//   -32를 빼면 소문자가 대문자가 되겠네?
   
//   대문자는 모두 소문자로 변경한다.
//   만약 'A' -> 'a' 바꾼다면 'A' 65이고, 'a' 97이니까,
//   +32를 하면 그럼 대문자가 되겠다.
   
//   그런데 만약에 '안'이라는 글자가 들어오면 어떻게 해야하지?
//   else if 숫자가 아니면 그냥 붙인다.
//   그러면 알파벳이 아닌걸 어떻게 찾아야하지?
//   'A' ~ 'Z' 까지의 범위를 구해보자!
//   그렇다면 이 범위는 어떻게 구하지?
//   'A' -> 65
//   'Z' -> 90
//   그러니까 이 범위는 65 이상 90 이하면 대문자겠네!
   
//   'a' ~ 'z' 까지의 범위를 구해보자!
//   97이상 122이하라면 소문자겠네
//   그렇다면 저 범위에 해당하지 않으면 모두 문자열이겠다!
   
//   입력 예)안녕hI!!
//   출력 예)안녕Hi!!
   Scanner sc = new Scanner(System.in);
//   String message = "대소문자를 바꿀 값을 입력하세요.ex)안녕Hi!",
//         input = null, result = "";
//   char[] arData1 = null;
//   int length = 0;
//   
//   System.out.println(message);
//   input = sc.nextLine();
//   length = input.length();
//   arData1 = new char[length];
//   
//   for(int i = 0; i < length; i++) {
//      char c = input.charAt(i);
//      if(c >= 65 && c <= 90) { // 대문자
//         arData1[i] = (char)(c + 32);
//      }else if(c >= 97 && c <= 122) { // 소문자
//         arData1[i] = (char)(c - 32);
//      }else {
//         arData1[i] = c;
//      }
//      result += arData1[i];
//   }
//   
//   System.out.println(result);
   
//   2. 정수를 한글로 변경
//   	1) 정수를 입력 받는다.
//   	2) 입력받은 문자열을 숫자로 변환시킨다.
//   	3) 1은 "일" 과 같은 값을 지정해준다.
//   	1 "일"
//   	2 "이"
//   	3 "삼"
//   	4 "사"
//   	5 "오"
//   	6 "육"
//   	7 "칠"
//   	8 "팔"
//   	9 "구"
//  	0 "공"
//  	4) 출력한다.
   String input2 = null, message2 = "정수를 입력하세요.\nex)1024", result2 = null;
   System.out.println(message2);
   
   input2 = sc.nextLine();
   
   
   for(int i = 0; i < input2.length(); i++) {
      int inputNum = input2.charAt(i) - 48;
      
      switch (inputNum) {
      case 1:
         result2 += "일";
         break;
      case 2:
         result2 += "이";
         break;
      case 3:
         result2 += "삼";
         break;
      case 4:
         result2 += "사";
         break;
      case 5:
         result2 += "오";
         break;
      case 6:
         result2 += "육";
         break;
      case 7:
         result2 += "칠";
         break;
      case 8:
         result2 += "팔";
         break;
      case 9:
         result2 += "구";
         break;
      case 0:
         result2 += "공";
         break;

      default:
         result2 += inputNum;
         break;
      }
   }
   
   System.out.println(result2);

   

   
   
   
		
		
		
	}
}