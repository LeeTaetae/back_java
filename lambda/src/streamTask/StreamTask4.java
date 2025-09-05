package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamTask4 {
	public void introduce(Member member) {
		String intro = "이름: " + member.getName() + "\n취미: " + member.getHobby() + "\n소개: " + member.getIntro();
		System.out.println(intro);
	}
	public static void main(String[] args) {
		
		ArrayList<Member> members = new ArrayList<Member>();
//		ArrayList<Long> hobbyIds = new ArrayList<Long>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다!");
		Member member5 = new Member("김유식", "축구_농구_야구", "나는 운동왕!");
		Member member6 = new Member("흰둥이", "개발_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("배승원", "개발_놀기", "자바가 제일 쉬웠어요");
		

		Member[] memberArray =  new Member[] {member1, member2, member3, member4, member5, member6, member7};
//		for(Member member : memberArray) {
//			members.add(member);
//		}
		members.addAll(Arrays.asList(memberArray));
//		System.out.println(members);
		
//		1) 각 멤버의 취미를 검토하시오.
//		취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 모두 출력하시오.
//		members.stream().filter((member) -> member.getHobby().contains("개발")).map((mem) -> "개발자: " + mem.getName()).forEach(System.out::println);
		
//		취미를 3개 이상 가진 사람의 아이디를 
//		"".split()
//		members.stream().filter((member) -> member.getHobby().split("_").length >= 3).map((n) -> n.getId()).forEach(System.out::println);
		
//		 ArrayList<Long> hobbyIds = members
//				.stream()
//				.filter((member) -> member.getHobby().split("_").length >= 3)
//				.map((n) -> n.getId())
//				.collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(hobbyIds);
		
//		hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기
//		hobbyIds
//			.stream()
//			.mapToInt(Long::intValue)
//			.boxed().map((i) -> members.get(i))
//			.map((u) -> u.getIntro())
//			.forEach(System.out::println);;
			
//		소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//			members.stream().filter((m) -> m.getIntro().chars().count() >= 13).map((mem) -> "이름 : " + mem.getName() + "\n취미 : "+ mem.getHobby() + "\n소개: " + mem.getIntro()).forEach(System.out::println);
//			members.stream().filter((m) -> m.getIntro().chars().count() == m.getIntro().length()).forEach(System.out::println);
		
				
			Member member = members
					.stream()
					.max(Comparator.comparingInt(m -> m.getIntro().length()))
					.get();
				
			StreamTask4 st4 = new StreamTask4();
//			st4.introduce(member);
			
			members.stream().map((m) -> m.getIntro().chars().count()).sorted().forEach(System.out::println);
			
//			
		
	}
}
