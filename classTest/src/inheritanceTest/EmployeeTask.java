package inheritanceTest;

public class EmployeeTask extends PersonTask {
int money;
	
	public EmployeeTask() {;}
	
	public EmployeeTask(String name, int age, String address, String phone, int money) {
		super(name, age, address,phone);
		this.money = money;
	}
	
	@Override
	public void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	
	@Override
	public void sleep() {
		System.out.println("잠을 설친다.");
	}
	
	@Override
	public void eat() {
		System.out.println("야식을 먹는다.");
	}
}
