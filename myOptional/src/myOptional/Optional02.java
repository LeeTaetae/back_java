package myOptional;

import java.util.Optional;

public class Optional02 {
	public static void main(String[] args) {
		
//	학생의 점수(score)가 null일 수도 있다.
//	Optional을 사용해서 다음을 출력하는 프로그램을 작성하시오.
		
//	점수가 있으면 점수를 출력한다.
		
//	점수가 없으면 "점수 없음"을 출력한다.
		
//	점수가 없으면 IllegalStateException("점수가 비어있음") 예외를 발생시켜 처리한다.
		
		Integer score = null;
		Optional<Integer> opScore = Optional.ofNullable(score);
		
		int result = opScore.orElse(90);
		System.out.println("점수 : " + result);
		
		opScore.ifPresent(n -> System.out.println("점수 : " + n));
		
		try {
			int mustScore = opScore.orElseThrow(() -> new IllegalArgumentException("점수 없음"));
			System.out.println(mustScore);
		} catch (IllegalArgumentException e) {
			System.out.println("점수가 비어있음");
		}
	}
}
