package inheritanceTest;


//class PersonTask {
//	String name;
//	int age;
//	String address;
//	String phone;
//	
//	public PersonTask() {;}
//	
//	public PersonTask(String name, int age, String address, String phone) {
//		this.name = name;
//		this.age = age;
//		this.address = address;
//		this.phone = phone;
//	}
//	
//	public void work() {
//		System.out.println("일을 한다.");
//	}
//	
//	public void sleep() {
//		System.out.println("잠을 잔다.");
//	}
//	
//	public void eat() {
//		System.out.println("세 끼를 먹는다.");
//	}
//}

//class StudentTask extends PersonTask{
//	String instaId;
//	
//	public StudentTask() {;}
//	
//	public StudentTask(String name, int age, String address, String phone, String instaId) {
//		super(name, age, address, phone);
//		this.instaId = instaId;
//	}
//	
//	@Override
//	public void work() {
//		System.out.println("아르바이트를 한다.");
//	}
//	
//	@Override
//	public void sleep() {
//		System.out.println("수업 시간에 잠을 잔다.");
//	}
//	
//	@Override
//	public void eat() {
//		System.out.println("아침을 거른다.");
//	}
//}



public class InheritanceTask2 {
	
	public static void main(String[] args) {
		String message = "========================";
		PersonTask person = new PersonTask("예성", 27, "경기", "77131372");
		StudentTask student = new StudentTask("예성", 27, "경기", "77131372", "xogml_oo");
		EmployeeTask employee = new EmployeeTask("예성", 27, "경기", "77131372" , 10000);
		
		person.work();
		student.work();
		employee.work();
		
		System.out.println(message);
		
		person.sleep(); 	
		student.sleep();
		employee.sleep();
		
		System.out.println(message);
		
		person.eat();
		student.eat();
		employee.eat();
	}
	
	
}
