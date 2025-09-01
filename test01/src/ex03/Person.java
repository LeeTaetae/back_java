package ex03;

public class Person {
	   
	//- 필드: 이름(name) - 문자열, 나이(age) - 정수, 직업(job) - 문자열, 취미(hobby) - 문자열
	   private String name;
	   private int age;
	   private String job;
	   private String hobby;
	   
	//   기본 생성자, 초기화 생성자
	   public Person() {;}
	   public Person(String name, int age, String job, String hobby) {
	      super();
	      this.name = name;
	      this.age = age;
	      this.job = job;
	      this.hobby = hobby;
	   }
	   
	//   getter, setter 생성 (private 접근)
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
	   public String getJob() {
	      return job;
	   }
	   public void setJob(String job) {
	      this.job = job;
	   }
	   public String getHobby() {
	      return hobby;
	   }
	   public void setHobby(String hobby) {
	      this.hobby = hobby;
	   }
	   
	//- 메서드
//	    ex) a) 메서드명
//	        - 기능
	   
	//a) printName
//	    - 해당 객체 필드의 이름을 출력해주는 기능을 가진 메서드
	   public void printName() {
	      System.out.println(this.getName());
	   }
	   
	//b) printwork
//	    - 해당 객체 필드의 직업을 출력해주는 기능을 가진 메서드
	   public void printwork() {
	      System.out.println(this.getJob());
	   }   
	   
	//c) printHobby
//	    - "취미는 잠자기 입니다."를 출력하는 메소드
	   public void printHobby() {
	      System.out.println("취미는 " + this.getHobby() + " 입니다.");
	   }   
	   
	   public static void main(String[] args) {
	      Person person = new Person("조예성", 27, "무직", "잠자기");
	      
	      person.printName();
	      person.printwork();
	      person.printHobby();
	   }

	}
