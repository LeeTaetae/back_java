package methodTest;

public class MethodTask5 {
//	1. 1 ~ n까지의 합을 구해주는 메서드
	void addNum(int num) {
		int count = 0;
		for(int i = 0; i< num; i++) {
//			System.out.println(i + 1);
			count += i + 1;
			
		}
		System.out.println(count);
	}
//	2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지, 확인한 결과를 반환해 주는 메서드
	void method(String nums) {
		if(nums.length() >= 2) {
			System.out.println("문자열입니다.");
		}
		for(int i = 0; i < nums.length(); i++) {
			
			char ch = nums.charAt(i);
			int number = (int) ch;
			if(i < 0 || number % 2 == 0 && nums.length()<=1) {
				System.out.print("짝수입니다.\n");
			}else {
				System.out.print("홀수입니다.\n");
			}
			
			
		}
	}
//		3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
//			1) 문자열 입력
//			2) 대문자인지 아닌지 확인 => 아스키코드
//			3) 소문자 => 대문자
	void toUpper(String str1) {
		for(int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			int in = (int) ch1;
			if(in > 96 && in < 123) {
				char ch2 = (char) (in-32);
				System.out.print(ch2 );				
			}
			
		}
	}
	
//	4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
//		1) 문자열을 받는다.
//		2) 문자열을 하나씩 확인한다.
//		3) 문자열을 반대로 나오게 한다.
//		4) 출력한다.
	
	void toReverse(String str3) {
		for(int i = 0; i < str3.length(); i++) {
			for(int j = str3.length() -1 ; j >= 0; j--) {
				char ch3 = str3.charAt(j);
				if(i < 1) {
					System.out.print(ch3);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MethodTask5 mt5 = new MethodTask5();
		
		mt5.addNum(5);
		mt5.method("5");
		mt5.toUpper("null");
		System.out.print("\n");
		mt5.toReverse("반갑습니다.");
	}
}
