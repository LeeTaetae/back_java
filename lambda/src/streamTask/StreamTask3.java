package streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	public static void main(String[] args) {
//		IntStream으로 시작
//		10, 30, 50, 70, 90만 ArrayList, List에 추가
//		ArrayList<Integer> datas1 = new ArrayList<Integer>();
//		List<Integer> datas2 = new List<>();
		
		//리턴타입 : IntStream int
		ArrayList<Integer> datas1 = IntStream.rangeClosed(1, 9) // intStream타입
				.filter((n) -> n % 2 == 1) //intStream 타입
				.map((n) -> n * 10) //IntStream
				.mapToObj(Integer::valueOf) //Stream<Integer>
				.collect(Collectors.toCollection(ArrayList::new));//List<Integer>
		
		
		datas1.stream().mapToInt(Integer::intValue).forEach(System.out::println);
		
	
	}
}
