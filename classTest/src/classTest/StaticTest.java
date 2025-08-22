package classTest;


class Data {
	int data = 10;
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data();
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		data1 = new Data(); //참조주소 잃어버림
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
	}

}
