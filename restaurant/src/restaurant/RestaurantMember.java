package restaurant;

public class RestaurantMember extends RestaurantCostomer{
	public RestaurantMember() {;}

	public RestaurantMember(String name, String phone, int balance, int point, int coupon) {
		super(name, phone, balance, point, coupon);
	}
	
}
