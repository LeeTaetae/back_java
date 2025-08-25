package castingTest;

class A {
	void test() {
		System.out.println("A");
	}
}

class B extends A {
	void test() {
		System.out.println("B");
	}
}
public class CastingTest {
	public static void main(String[] args) {
		A b = new B();
		B bb = (B) b; //다운 캐스팅
		b.test();
		bb.test();
		
	}
}
