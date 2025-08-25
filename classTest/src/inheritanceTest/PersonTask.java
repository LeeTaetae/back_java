package inheritanceTest;

public class PersonTask {
	String name;
	int age;
	String address;
	String phone;
	
	public PersonTask() {;}
	
	public PersonTask(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	public void work() {
		System.out.println("일을 한다.");
	}
	
	public void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	public void eat() {
		System.out.println("세 끼를 먹는다.");
	}

}
