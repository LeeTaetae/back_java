package myOptional;

import java.util.Optional;

public class Optional01 {
	public static void main(String[] args) {
		
//		null일 수도 있는 값
		String name = null;
		
//		Optional로 감싸기
		Optional<String> opName = Optional.ofNullable(name);
		
//		값이 없으면 기본값을 제공
		String result = opName.orElse("이태희");
		System.out.println("이름 : " + result);
		
//		값이 있을 때만 실행
		opName.ifPresent(n -> System.out.println("실제 값 : " + n));

//		값이 없으면 예외 발생
		try {
			String mustHave = opName.orElseThrow(() -> new IllegalArgumentException("값이 없음"));
			System.out.println(mustHave);
		} catch (IllegalArgumentException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
}
