package methodTest;

import java.util.Scanner;

public class MethodTask4 {
	void NameAndCount(String name, int num) {
		for(int i = 0; i < num; i++) {
			int count = num;
//			System.out.println(name);
			if(i == 0) {
			System.out.println("횟수 : " + count);
			}
			if(i == num -1) {
				System.out.print(name);
			}else {
				System.out.print(name + ",");
			}
		}
	}
	public static void main(String[] args) {
		MethodTask4 mt4 = new MethodTask4();
		Scanner sc = new Scanner(System.in);
		
		String message = "이름과 횟수를 입력하세요.", name = null;
		int count = 0;
		System.out.println(message);
		name = sc.next();
		count = sc.nextInt();
		
		mt4.NameAndCount(name, count);
//		mt4.NameAndCount("피카츄", 20);
	}
}
