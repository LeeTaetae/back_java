package classTest;

//	동물(ClassTask)
//	이름, 나이, 먹이


// 추상화
public class ClassTask {
//	필드
	String name;
	int age; 
	String feed;
	
	
//	생성자의 오버로딩
	public ClassTask() {;}
	
//	초기화 생성자
	public ClassTask(String name, int age, String feed) {
	
	this.name = name;
	this.age = age;
	this.feed = feed;
}
	public void sound(String soul) {
		System.out.println(soul + "하고 웁니다.");
	}

	public static void main(String[] args) {
		ClassTask ct1 = new ClassTask("토끼" ,8, "당근");
		ClassTask ct2 = new ClassTask("강아지", 3, "사료");
		
		System.out.println(ct1.age +" " +ct1.name + " " + ct1.feed + "" );
		ct1.sound("깡총");
		System.out.println(ct2.name);
		ct2.sound("멍멍");
	}
	
}
