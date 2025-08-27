package castingTask4;

public class Market {
	private String name;
	
	public Market() {;}

	public Market(String name) {
		super();
		this.name = name;
	}
	
	public void getSell(Product product, MarketUser user) {
		if(user.getMoney() >= product.getPrice() && product.getCount() > 0) {
			if(user instanceof MarketMember) {
				int discount = (int)(product.getPrice() * 0.7);
				user.setMoney(user.getMoney() - discount);
				System.out.println("지불할 가격은 " + discount + "원 이며, 현재 남은 잔액은 " + user.getMoney() +"원 입니다.");
				product.setCount(product.getCount() - 1);
				System.out.println("남은 재고 : " + (product.getCount()));
			} else if(user instanceof MarketNonMember) {
				//쿠폰 10장 있을 때
				if(user.getCoupon() >= 10) {
					user.setCoupon(user.getCoupon() - 10);
					System.out.println("쿠폰 10장을 사용하셨습니다. 남은 잔액 : " + user.getMoney() + " 남은 쿠폰 수 : " + user.getCoupon());
				}else {
					//비회원 + 쿠폰없음
					int discount = (int)(product.getPrice() * 0.95);
					user.setMoney(user.getMoney() - discount);
					System.out.println("지불할 가격은 " + discount + "원 이며, 현재 남은 잔액은 " + user.getMoney() + "원 입니다.");
					user.setCoupon(user.getCoupon() + 1);
					System.out.println("쿠폰이 발급되었습니다! 남은 쿠폰 수 : " + user.getCoupon());
					product.setCount(product.getCount() - 1);
					System.out.println("남은 재고 : " + product.getCount());
				}
			}
		} else if(user.getMoney() >= product.getPrice() && product.getCount() <= 0) {
			System.out.println("상품이 존재하지 않거나 잔액이 부족합니다.");
		} else {
			System.out.println("그냥 꺼지세요");
		}
	}
	

	Product[] products = new Product[5]; 
	//등록한 상품
	int productCount = 0; 
	
	public void getRegisterProduct(Product product) {
		//등록된 상품 확인하고
		//이름의 중복 체크하기 
		for(int i = 0; i < productCount; i++) {
			if(products[i].getName().equals(product.getName())) {
				System.out.println("이미 등록된 상품이 존재합니다." + product.getName());
				return;
			}
		}
		
		//최대 5개까지 등록
		if(productCount >= products.length) {
			System.out.println("상품 등록 개수를 초과하였습니다 최대 5개 : " + product.getName());
			return;
		} 
		
		//5개 제한
		if(product.getCount() > 5) {
			product.setCount(5);
			System.out.println("재고는 최대 5개까지만 가능합니다.");
		}
		
		//등록
		products[productCount++] = product;
		System.out.println("상품이 등록되었습니다 : " + product.getName() + " / 가격 : " + product.getPrice() + "원 / 재고 : " + product.getCount());
		
	}
	
	//포인트 적립
	public void getPoint(Product product, MarketUser user) {
		//회원인 경우
		if(user instanceof MarketMember) {
			//적립
			int plus = (int)(product.getPrice() * 0.1);
			user.setPoint(plus);
			System.out.println("적립 포인트 : " + user.getPoint());
			//비회원인 경우
		} else if( user instanceof MarketNonMember) {
			//적립
			int plus = (int)(product.getPrice() * 0.05);
			user.setPoint(plus);
			System.out.println("적립 포인트 : " + user.getPoint());
		}
	}
	
}
