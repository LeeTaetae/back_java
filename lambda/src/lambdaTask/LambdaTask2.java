package lambdaTask;

//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaTask2 {
	public static void main(String[] args) {
		LambdaInter lambda1 = () -> {for(int i = 0; i < 10; i++) {if(i + 1 < 10) {System.out.print(i + 1 + ", ");}else if(i + 1 == 10) {System.out.println(i + 1);}}};
		lambda1.printUpToTen();
		
		System.out.println("--------------------");
		LambdaInter2 lambda2 = (str, c) ->{
			int count = 0;
			for(char ch : str.toCharArray()){
				if(ch == c) {
					count++;
				}
			} 
			return count;			
		};
			
		System.out.println(lambda2.printString("안녕" , '안'));
		
		System.out.println("-------------------");
		
		LambdaInter3 lambda3 = (str) -> {
			for(int i = str.length() -1 ; i >= 0; i--) {
					char ch = str.charAt(i);
					System.out.print(ch);
			}					
			};
			
		lambda3.reverseString("Hello");
		
		System.out.println("\n-----------------");
		Remove remove = (str, ch) -> {
			return str.replaceAll(String.valueOf(ch), "");
		};
		System.out.println(remove.removeStr("dog", 'o'));
		
		Dedupe de = (str) -> {
			String result ="";
			for(int i = 0; i < str.length(); i++) {
				if(!result.contains(String.valueOf(str.charAt(i)))) {
					result += str.charAt(i);
				}
			}
			return result;
		};
		
		System.out.println(de.getDedupe("dsdfdfdgf"));
	}
}
