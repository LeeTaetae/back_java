package method;

public class Method {
//	1. 반환값과 매개변수가 모두 있는 메서드
	public int multiply(int x ,int y) {
		return x * y;
	}
	
//	2. 반환값은 없고 매개변수가 있는 메서드
	public void printName(String name) {
		System.out.println("이름 : " + name);
	}
	
//	3. 반환값이 있고 매개변수가 없는 메서드
	public String getGreet() {
		return "안녕하세요!";
	}
	
//	4. 반환값과 매개변수가 모두 없는 메서드
	public void printHello() {
		System.out.println("Hello");
	}
	
//	메서드 호출하기
	public static void main(String[] args) {
		Method method = new Method();
		
//		1번 메서드 실행
		System.out.println(method.multiply(5, 6));
		
//		2번 메서드 실행
		method.printName("여우누이");
		
//		3번 메서드 실행
		System.out.println(method.getGreet());
		
//		4번 메서드 실행
		method.printHello();
	}
}
