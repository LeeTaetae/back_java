package classTask;


class Market {
	String productName;
	double price;
	int count;
	double forSale;
	double accept;
	
	public Market() {;}

	public Market(String productName, double price, double forSale, int count) {
		this.productName = productName;
		this.price = price;
		this.forSale = forSale;
		this.count = count; // 할인 금약
	}
	
	void sell(Customer customer) {
		accept = this.price - this.forSale;
		
		if(this.count > 0 && customer.money >= this.accept) {
			customer.money -= this.accept;
			this.count--;
			System.out.println(customer.name + "님이 "  + this.productName + "(을)를 " + this.accept + "에 구매했습니다.");
			System.out.println("남은 돈 : " + customer.money + "원");
			System.out.println("남은 재고 : " + this.count);
		}else {
			System.out.println("재고가 없거나 잔액이 부족합니다.");
		}
	}
}

class Customer {
	String name;
	String phone;
	int money;
	double sale;
	
	public Customer() {;}
	

	public Customer(String name, String phone, int money) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
	}


	public Customer(String name, String phone, int money, int sale) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.sale = sale;
	}
	
	void getSale(Market market) {
		sale = (market.price - market.forSale) / market.price * 100;
		System.out.println(sale);
	}
	
	
}
public class ClassTask2 {
	public static void main(String[] args) {
		Customer cos1 = new Customer("잉님" , "01057051641", 30000);
	
		Market ma1 = new Market("포카칩" , 2500, 1000, 3);
		
		ma1.sell(cos1);
		
		
	}
}

