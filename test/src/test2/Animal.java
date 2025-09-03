package test2;

public class Animal {
	private String name;
	private int age;
	
	public Animal() {;}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String printName() {
		return ("이름은 " + this.getName() + "입니다.");
	}
	
	public void printAge() {
		System.out.println("나이는 " + this.getAge() + "입니다.");
	}
}
