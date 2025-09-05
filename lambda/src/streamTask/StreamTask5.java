package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamTask5 {
	public static void main(String[] args) {
		
		ArrayList<Member> members = new ArrayList<Member>();
//		String memmem = new ArrayList<String>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다!");
		Member member5 = new Member("김유식", "축구_농구_야구", "나는 운동왕!");
		Member member6 = new Member("흰둥이", "개발_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("배승원", "개발_놀기", "자바가 제일 쉬웠어요");
		

		Member[] memberArray =  new Member[] {member1, member2, member3, member4, member5, member6, member7};
		members.addAll(Arrays.asList(memberArray));
		
		
		String[] memmem = members.stream().filter((n) -> n.getHobby().split("_").length == 2).map((member) -> member.getHobby()).collect(Collectors.joining("_")).split("_");
		
		ArrayList<String> hobbiesList = new ArrayList<String>(Arrays.asList(memmem));
		System.out.println(hobbiesList);
		System.out.println(hobbiesList.size());
	}
}
