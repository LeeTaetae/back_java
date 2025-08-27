package abstractTest;

public class AbstractTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog(); //업캐스팅
		Animal dog2 = new Dog(); //업캐스팅
		Pet dog3 = new Dog(); //업캐스팅 
		//구현이 안된 인터페이스를 그대로 가져다 구현함
		//인터페이스는 강제성을 부여함 
		//Dog는 자식임
	}
}
