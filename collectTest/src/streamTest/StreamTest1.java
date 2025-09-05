package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest1 {
	public static void main(String[] args) {
//		1 ~ 10 까지 중 1 ~ 5숫자만 배열에 담아서 출력
		ArrayList<Integer> datas1 =IntStream.rangeClosed(1, 10).filter((n) -> n >=1 && n <= 5).mapToObj(Integer::valueOf).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(datas1);
		
		ArrayList<String> members = new ArrayList<String>();
		
		members.add("이태희_2조");
		members.add("최준서_1조");
		members.add("송병국_2조");
		members.add("김정수_1조");
		
		String[] teams=members.stream().filter((member) -> member.contains("조")).map((mem) -> mem.replace("_",  ":")).toArray(String[]::new);
		System.out.println(Arrays.toString(teams));
		
		ArrayList<String> students = new ArrayList<String>();

		students.add("홍길동-서울");
		students.add("이순신-부산");
		students.add("강감찬-서울");
		students.add("신사임당-대구");
		
//		1. 도시가 '서울'인 학생들만 뽑아서 배열에 담아 출력하시오.
		ArrayList<String> seouls = students.stream().filter((student) -> student.contains("서울")).map((st) -> st).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(seouls);
		
//		2. 모든 학생 이름만 뽑아서 배열에 담아 출력하세요.
		ArrayList<String> names = students.stream().map((st) -> st.split("-")[1]).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(names);
		
//		3.모든 도시 이름만 뽑되, 중복제거해야함
		ArrayList<String> cities = students.stream().map((city) -> city.split("-")[1]).distinct().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(cities);
	}
}
