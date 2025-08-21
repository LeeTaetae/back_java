package methodTest;

public class MethodTask3 {
	
//	1. 1부터 n번까지 출력해주는 함수
	void printNum (int num) {
		for(int i = 0; i < num; i++) {
			if(i == num -1) {
				System.out.print(i + 1);
			} else {				
				System.out.print( i + 1 + ",");
			}
		}
	}
	public static void main(String[] args) {
		MethodTask3 mt3 = new MethodTask3();
		mt3.printNum(20);
	}
}