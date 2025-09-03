package test2;

public class AnimalMain {
	public static void main(String[] args) {
		Animal dog = new Dog("뽀삐", 3 , "말티즈");
		Animal cat = new Cat("나비" , 5 , "갈색");
		
		if(dog instanceof Dog) {
			Dog d = (Dog) dog;
			System.out.println(d.printName());
			d.getBark();
		}
	}
}
