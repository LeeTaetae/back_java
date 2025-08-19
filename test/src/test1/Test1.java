package test1;

public class Test1 {
 public static void main(String[] args) {
	boolean stop = false, result1 = false, result2 = false;
	int x = 0;
	
	stop = true;
	if(stop) {
		System.out.println("중지합니다.");
	}else {
		System.out.println("시작합니다.");
	}
	
	x = 10;
	result1 = (x == 20);
	result2 = (x != 20);
	
	System.out.println("result1: " + result1);
	System.out.println("result2: " + result2);
}
}
