package streamTask;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
//		1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		Integer total = 0;
		for(Integer number : numbers1) {
			total += number;
		}
		System.out.println(total);
		
//		2. IntStream
		IntStream.rangeClosed(1,6).map(n -> n*10).mapToObj(Integer::valueOf).collect(Collectors.toCollection(ArrayList::new)).stream().mapToInt(Integer::intValue).sum();;
		numbers2.stream().mapToInt(Integer::intValue).sum();
		
//		3. Stream<T>
//		.mapToInt(): Stream<T> -> IntStra,
//		.mapToObject() : IntStream -> Stream<T>
//		numbers1.stream().mapToInt(Integer::intValue).sum();
//		numbers1.stream().mapToInt(Double::doubleValue)
//		numbers1.stream().mapToInt(Boolean::booleanValue)
		
		
		
	}
	
}
