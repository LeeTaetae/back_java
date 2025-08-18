package formatTest;

public class FormatTest {
	public static void main(String[] args) {
		
		String name = "김세환";
		int age = 20;
		double height = 199.9;
		
		System.out.printf("저의 이름은 %S 이고 %d살 입니다. 키는 %.1fcm 입니다.", name, age, height);
	}
}
