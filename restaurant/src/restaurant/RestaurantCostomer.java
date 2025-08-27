package restaurant;

public class RestaurantCostomer {
	private String name;
	private String phone;
	private int balance;
	private int point;
	private int coupon;
	
	public RestaurantCostomer() {;}

	public RestaurantCostomer(String name, String phone, int balance, int point, int coupon) {
		super();
		this.name = name;
		this.phone = phone;
		this.balance = balance;
		this.point = point;
		this.coupon = coupon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	
	
}
