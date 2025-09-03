package test2;

public class Dog extends Animal{
	private String breed;
	
	public Dog() {;}

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public String printName() {
		return("강아지 이름은 " + this.getName() + "입니다.");
	}
	
	public void getBark() {
		System.out.println(this.getName() + "가 멍멍 짖습니다.");
	}
}
