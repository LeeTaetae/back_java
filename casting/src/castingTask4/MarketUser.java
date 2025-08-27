package castingTask4;

public class MarketUser {
	private String name;
	private String phone;
	private int money;
	private int coupon;
	private int point;
	
	public MarketUser() {;}

	public MarketUser(String name, String phone, int money, int coupon, int point) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.coupon = coupon;
		this.point = point;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
