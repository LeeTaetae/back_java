package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.IntStream;

public class StreamTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		
//		1 ~ 10까지 추가
//		IntStream.rangeClosed(1, 10).forEach(n -> {datas1.add(n);});
//		System.out.println(datas1);
		
//		1 ~ 5까지 지우기
//		IntStream.range(0,5).forEach((n) -> {datas1.remove(0);});
//		System.out.println(datas1);
		
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		
//		10 ~ 1까지 추가
		IntStream.range(0, 10).forEach(n -> {datas2.add(10 - n);});
//		System.out.println(datas2);
		
		ArrayList<String> datas3 = new ArrayList<String>();
		"ABCDEFGHIJK".chars().forEach((n) -> {datas3.add(String.valueOf((char)n));});
//		datas3.forEach(System.out::print);
		
		ArrayList<String> datas4 = new ArrayList<String>();
//		1. char로 변환 
//		2. 아스키코드가 97 ~ 122 인 수를 datas4에 추가
//		3. String.valueof()사용.
//		4. datas4를 반복하면서 문자 하나씩 출력
//		5. 출력된 문자들이 소문자라면,
//		6. datas4를 출력(배열)
		"aBcDeFgHiJk".chars().forEach((n) -> {
			if(97 <= n && n <= 122) {
				datas4.add(String.valueOf((char)n));
			}
		});
//		datas4.forEach(System.out::print);
//		System.out.println(datas4);
		
		ArrayList<String> datas5 = new ArrayList<String>();
//		1. char로 변환
//		2. 아스키코드가 97 ~ 122일 경우 : 대문자로 변경 후 datas5에 추가
//		3. 아니라면, String.valueOf()로 추가
//		4. datas5를 출력
		"aBcDeFgHiJk".chars().forEach((n) -> {
			if(97 <= n && n <= 122) {
				datas5.add(String.valueOf((char)n).toUpperCase());
			}else {
				datas5.add(String.valueOf((char)n));
			}
		});
		datas5.forEach(System.out::print);
//		System.out.println(datas5);
	}
}
