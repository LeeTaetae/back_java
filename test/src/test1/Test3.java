package test1;

public class Test3 {
	public static void main(String[] args) {
		int value = 0;
		double area = 0.0;
		
		value = 123;
		
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		area = 3.14159 *10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10,area);
	}
}
