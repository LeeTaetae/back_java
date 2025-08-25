package randomTest;

import java.util.Random;

public class RandomTest {
	// 1. 반복되는 코드를 반복문으로
	// 2. 메서드로 생성
	// 3. 6개를 배열로 리턴
	// 4. 메인 메서드에서 사용
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(46));
		System.out.println(random.nextInt(46));
		System.out.println(random.nextInt(46));
		System.out.println(random.nextInt(46));
		System.out.println(random.nextInt(46));
		System.out.println(random.nextInt(46));
		System.out.println(random.nextInt(46));
	
	}
}
