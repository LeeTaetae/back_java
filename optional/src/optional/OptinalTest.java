package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptinalTest {
	
		
		ArrayList<User> users = new ArrayList<User>(Arrays.asList(
				new User("이태희", "lth", "1234"),
				new User("홍길동", "hgd", "1234"),
				new User("이순신", "lss", "1234"),
				new User("장보고", "jbg", "1234")
			));
//		if문에 한 번이라도 들어가지 않았다면 null이 리턴
//		NPE 발생
//		*강조 : 반드시 리턴 타입에만 OPtional을 사용하고, 단일 객체만 사용한다.
//		나쁜 예시 ) Optional<List(User)>
		public  Optional<User> findById(Long id) {
			User user = null;
			for(User userInDb : users) {
				if(userInDb.getId() == id) {
					user = userInDb;
				}
			}
			return Optional.ofNullable(user);
		}
		
		public static void main(String[] args) {
			OptinalTest optionalTest = new OptinalTest();
			
			Optional<User> foundUser = optionalTest.findById(200L);
			
//			실무에서 가장 많이 쓰이는 null처리
//			user가 null 아니면 통째로가 User
//			null이면 throw
			User user;
			
			try {
				user = foundUser.orElseThrow(() -> {
					throw new NoSearchUserException("유저를 찾을 수 없습니다.");
				});
			} catch (NoSearchUserException e) {
				// TODO Auto-generated catch block
				System.out.println("유저를 찾을 수 없습니다.");
			}
			
//			boolean
			System.out.println(foundUser.map(User::getId).isPresent());
			
			User user1 = null;
			if(foundUser.isPresent()) {
				user1 = foundUser.get();
			}
			
//			.ifPresent()
//			값이 있을 때에만 해당 로직을 수행
			optionalTest.findById(1L).map(User::getUserEmail).ifPresent((email) -> {
				System.out.println(email);
			});
			
			
			optionalTest.findById(2L).map(User::getUserEmail).ifPresentOrElse((email) -> {System.out.println(email);}, () -> {
				System.out.println("존재하지 않는 유저입니다.");
			});
			
		} 
}
