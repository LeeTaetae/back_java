package ex03;
//- 패키지명: ex03
//- 클래스명: PersonMain
//※ 요구 사항    
//1. 학생(student), 프로그래머(programmer)를 Person 클래스 타입으로 업캐스팅하여 객체화(instance)를 생성한다.
//2. Person으로 업캐스팅한 객체를 다운캐스팅하여 자식 객체가 가진 모든 메서드를 호출하세요.
public class PersonMain {
	public static void main(String[] args) {
		Person ps1 = new Student();
		Person ps2 = new Programmer(null, 0, null, null, false, args);
	}
}