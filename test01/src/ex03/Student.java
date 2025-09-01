package ex03;

public class Student extends Person {
	//- 필드: 학번(number) - 정수
	   private int number;

	   public Student() {;} 
	   public Student(String name, int age, String job, String hobby, int number) {
	      super(name, age, job, hobby);
	      this.number = number;
	   }
	   
	   public int getNumber() {
	      return number;
	   }
	   public void setNumber(int number) {
	      this.number = number;
	   }
	   
	   
	   
	//a) printName
//	    - "OO님 환영합니다"을 출력해주는 기능을 가진 메서드
//	    - OO은 해당 필드의 이름
	   
	   @Override
	   public void printName() {
	      System.out.println(getName() + "님 환영합니다");
	   }
	   
	   
	//b) printWork
//	    - “OO은 공부를 합니다. ”을 출력해주는 기능을 가진 메서드
//	    - OO은 해당 필드의 이름
	   
	   @Override
	   public void printwork() {
	      System.out.println(getName() + "은 " + getHobby() + "를 합니다");
	   }   
	   
	   
	//c) printHobby
//	    - 전달한 문자열과 문자형이 있을 때 문자형의 개수를 찾아주는 메서드를 구현하시오.
	   
	   public void printHobby(String str, char ch) {
	      int resultLength = 0;
	      for(int i = 0; i < str.length(); i++) {
	         resultLength = str.length() - str.replaceAll(String.valueOf(ch), "").length();
	      }
	      System.out.printf("문자형 %c\n문자형의 개수 %d개" , ch, resultLength);
	   }
	   
	//d) getNumber
//	    - 랜덤한 '8자리' 번호의 문자열 값을 자신이 가진 학번(Number)필드에 대입하고, 대입한 그 ‘8자리’ 번호를 리턴한다.
//	    ex) "17882738"
	   public int getNumber(Student student) {
	      int insertNum = student.getNumber();
	      return insertNum;
	   }
	   
	   
	// e) checkNumber
//	    - 학생(Student)과 가진 번호를 비교하여 번호가 같다면 true 같지 않다면 false를 리턴한다.
	   public boolean checkNumber(Student student) {
	      boolean check = false;
	      if(student.getNumber() == getNumber()) {
	         check = true;
	         return check;
	      }
	      return check;
	   }
	   
	   
	   public static void main(String[] args) {
	      Student student = new Student("조예성", 27, "무직", "공부", 77131372);
	      
	      student.printName();
	      student.printwork();
	      student.printHobby("Hello", 'l');
	      student.getNumber(student);
	   }
	   
	}
