package methodTest;

public class MethodTask1 {
	
//	1. 1 ~ 10까지 출력해주는 메서드
	public void printNum(int num) {
		for(int i = 0; i < num; i++) {
			if(i+1 == num) {
				System.out.print(i + 1);
			}else {
				System.out.print(i + 1 + ",");
			}
		}
	}
//	2. 1번 메서드 사용

	public static void main(String[] args) {
		MethodTask1 mt1 = new MethodTask1();
		
		mt1.printNum(5);
	}
}
