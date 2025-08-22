package classTask;


class Market {
	String productName;
	int price;
	int count;
	int forSale;
	int accept;
	
	public Market() {;}

	public Market(String productName, int price, int forSale, int count) {
		this.productName = productName;
		this.price = price;
		this.forSale = forSale;
		this.count = count;
	}
	
	void sell(Customer customer) {
		accept = this.price * (1 - customer.sale);
		System.out.println(accept);
	}
}

class Customer {
	String name;
	String phone;
	int money;
	int sale;
	
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
		cos1.getSale(ma1);
		
	}
}
