package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream() : 정수형 문법을 이용
//		.range(시작, 끝) : 마지막을 포함하지 않음
//		.rangeClosed(시작, 끝) : 마지막을 포함함
		IntStream.range(0, 10).forEach((n) -> {datas.add(n);});
		
//		System.out.println(datas);
		
		
//		참조형 문법
//		.(소속::메서드명)
//		IntStream.range(1, 6).forEach(System.out::println);
		
//		datas.stream().forEach((n) -> {
//			if(n % 2 == 0) {
//				System.out.println(n);
//			}
//		});
		
//		datas.stream().filter((n) -> (n % 2 == 1)).forEach(System.out::println);
		
//		.stream() : 컬렉션을 Stream 객체로 변경
//		.chars() : 문자열을 Stream 객체로 변경
		"ABCD".chars().forEach((c) -> {
			System.out.println((char)c);
		});
	
	}
}
