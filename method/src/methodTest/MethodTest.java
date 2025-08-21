package methodTest;

public class MethodTest {
	
//	3개의 정수를 받아서, 모두 뺀 값을 반환해 주는 메서드
	public int minusResult(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
//	성과 이름을 붙여서 출력해주는 메서드 선언
	public void fullName(String firstName, String lastName) {
		System.out.println(firstName + lastName);
	}
	
	public void animal(String name, String feed) {
		System.out.println(name + "은(는) " + feed + "을(를) 먹습니다.");
	}
	
	public static void main(String[] args) {
//		메서드
//		클래스 안에 메서드
//		
		MethodTest mt = new MethodTest();
		int result = mt.minusResult(10, 20, 30);
		System.out.println(result);
			
		mt.fullName("이", "태희");
		
		mt.animal("토끼", "당근");
		
		
	}
}
