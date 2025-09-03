package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask3 {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1L, "컴푸터", 800000, 20));
		products.add(new Product(2L, "책상", 150000, 100));
		products.add(new Product(3L, "마우스", 50000, 15));
		products.add(new Product(4L, "모니터", 300000, 150));
		products.add(new Product(5L, "키보드", 30000, 5));
		
//		System.out.println(products);
		
		// 1. 재고가 100개 이상인 상품만 출력
//		for(Product product : products) {
////			System.out.println(product);
//			if(product.getStock() >= 100) {
//				System.out.println(product);
//			}
//		}
		
		// 2. 마우스 가격을 100000원으로 변경
//		for(Product product : products) {
//			if(product.getId().equals(3L)) {
//				product.setPrice(100000);
//			}
//			
//			System.out.println(product);
//		}
		
//		Product foundProduct = null;
//		for(Product product : products) {
//			if(product.getId() == 3L) {
//				foundProduct = product;
//			}
//		}
//		foundProduct.setPrice(100000);
//		
//		try {
//			if(products.contains(foundProduct)) {
//				products.set(products.indexOf(foundProduct), foundProduct);
//			}
//		} catch (IndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			System.out.println("예외 발생");
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// 3. 상품 재고가 100개 이하인 상품을 삭제
//		ArrayList<Product> newProduct = new ArrayList<Product>();
//		for(Product product : products) {
//			if(product.getStock() > 100) {
//				newProduct.add(product);
//			}
//		}
//		products = newProduct;
//		System.out.println(products);
		
		// 4. 상품이름이 "마우스"인 상품을 삭제하기
//		ArrayList<Product> newProduct = new ArrayList<Product>();
//		for(Product product : products) { //ArrayList에 Product가 담겨있는 타입이며 값들을 순차적으로 넣을 수 있게 함
//			if(!product.getName().equals("마우스") ) {
//				newProduct.add(product);
//			}
//		}
//		products = newProduct;
//		System.out.println(products);
		
		for(int i = 0; i < products.size(); i++) {
			
			try {
				if(products.get(i).getName().equals("마우스")) {
//				System.out.println(i);
					products.remove(i);
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 예외 발생");
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(products);
	}
}
