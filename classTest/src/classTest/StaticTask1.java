package classTest;

class Employee {
	String name;
	int age;
	static int money;
	int income;
	
	public Employee() {;}
	
	public Employee(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
		money += this.income;
	}
	
	void increaseIncome() {
			System.out.println("회사의 돈 : " + money);
	}
}
public class StaticTask1 {
	
	public static void main(String[] args) {
		Employee em1 = new Employee("홍씨", 27, 19_000);
		System.out.println(em1.name);
		System.out.println("홍씨 월급 : " + em1.income);
		em1.increaseIncome();
		Employee em2 = new Employee("비비", 27, 20_000);
		System.out.println("비비씨 월급 : " + em2.income);
		em2.increaseIncome();
		Employee em3 = new Employee("라라", 22, 32_000);
		System.out.println( em3.name +"씨 월급 : " + em3.income);
		em3.increaseIncome();
		
		
		
	}

	
}
