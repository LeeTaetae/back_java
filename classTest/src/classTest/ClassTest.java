package classTest;

// 추삼화
public class ClassTest {
//	필드 , 필드 변수 , 멤버변수. 멤버
	String name;
	int age;
	
//	기본 생성자 (반드시 기본으로 만들어둔다) 
	public ClassTest() {;}
//	초기화 생성자
//	this = 자기 자신의 주소값
	public ClassTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
//		객체화
		ClassTest ct = new ClassTest("이태희", 27);
		System.out.println(ct.name);
		System.out.println(ct.age);
	}
}
