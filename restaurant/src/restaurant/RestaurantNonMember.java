package restaurant;

public class RestaurantNonMember extends RestaurantCostomer{
	public RestaurantNonMember() {;}

	public RestaurantNonMember(String name, String phone, int balance, int point, int coupon) {
		super(name, phone, balance, point, coupon);
	}
	
	
}
