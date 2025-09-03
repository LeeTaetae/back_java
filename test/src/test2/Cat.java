package test2;

public class Cat extends Animal {
	private String color;
	
	public Cat() {;}

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String printName() {
		return ("고양이 이름은 " + this.getName() + "입니다.");
	}
	
	public void meow() {
		System.out.println(this.getName() + "가 야옹합니다.");
	}
}
