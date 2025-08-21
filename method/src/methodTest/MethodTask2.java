package methodTest;

public class MethodTask2 {
//	1. 이름을 10번 출력해주는 메서드
//		1) 이름을 매개변수로 받는다
//		2) 10번 출력한다.
	public void printName(String name, int num) {
		for(int i = 0; i < num; i++) {
//			System.out.print(name + ",");
			if(i == num - 1) {
				System.out.print(name);
			}else {
				System.out.print(name + ",");
			}
		}
	}
	
	
	public static void main(String[] args) {
		MethodTask2 mt2 = new MethodTask2();
//		mt2.printName("이태희", 3);
		mt2.printName("카리나", 8);
		
	}
}
