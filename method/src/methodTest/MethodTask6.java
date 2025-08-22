package methodTest;

public class MethodTask6 {
//	1. 문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드
//		1) 문자열을 받는다.	
//		2) 문자열 하나하나를 가지고온다.
//		3) 문자열의 개수를 구해본다.
//		4)출력한다.
	void wantStr(String str1, char ch) {
		int count = 0;
		String str2 = "";
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("입력한 문자 : " + str2);
		System.out.println("입력한 문자의 개수 : " + count + "개");
		
	}
	public static void main(String[] args) {
		
		MethodTask6 mt6 = new MethodTask6();
		
		mt6.wantStr("안녕하세요", '녕');
	}
}
	