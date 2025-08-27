package restaurant;

public class RestaurantTask {
	public static void main(String[] args) {
		Restaurant res1 = new Restaurant("파스타" , 7, 2);
		MenuItem menu1 = new MenuItem("스파게티" ,18000, 49 );
		res1.getRegister(menu1);
	}
}
