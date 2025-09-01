package objectTask;



public class ObjectTask1 {
	public static void main(String[] args) {
		Product product = new Product(1, "파인애플", 20000, 15, "필리핀");
		
		if(product.equals(new Product(1, "파인애플", 20000, 15, "필리핀"))) {
			System.out.println("동일한 제품입니다.");
		}else {
			System.out.println("다른 제품임! 신고바람");
		}
		
		System.out.println(product.toString());
	
	}
}
