package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void enginStart() {
		System.out.println("열쇠 시동 켜짐");
		
	}
	
	void enginStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
}


class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void enginStart() {
		System.out.println("음성으로 시동켬");
	}
	
	@Override
	void enginStop() {
		System.out.println("음성으로 시동끔");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar();
		Car matiz = new Car();
		
		matiz.enginStart();
		ferrari.enginStart();
	}
}
