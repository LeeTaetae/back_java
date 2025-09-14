package Optional02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class User {
//	User 클래스 (필드: name, email) 를 만든다.
//
//	미리 4명의 유저를 ArrayList<User>에 담아둔다.
//
//	함수 findByEmail(String email) 을 작성하고, Optional<User> 를 반환한다.
//
//	일치하는 유저가 있으면 Optional.of(유저), 없으면 Optional.empty()
//
//	main에서 아래를 수행하라.
//
	
	private Long id;
	private String name;
	private String email;
	private static Long seq;
	
	static {
		seq = 1L;
	}
	{
		seq++;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User() {;}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	
//	미리 4명의 유저를 ArrayList<User>에 담아둔다.
	
	private static final ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("송병국" , "sbk@naver.com"),
			new User("최준서" , "cjs@naver.com"),
			new User("이태희" , "lth@naver.com")
			)); 
//	함수 findByEmail(String email) 을 작성하고, Optional<User> 를 반환한다.
	
	public static Optional<User> findByEmail(String email) {
		for(User user : users) {
				if(user.getEmail().equals(email)) {
					return Optional.of(user);
				}
		}
		return Optional.empty();
	}
	public static void main(String[] args) {
		
//	일치하는 유저가 있으면 Optional.of(유저), 없으면 Optional.empty()
		Optional<User> user1 = findByEmail("lth@naver.com");
		user1.ifPresent((u) -> System.out.println("찾은 유저 : " + u.getName() + "\n유저의 아이디 : " + u.getEmail()));
		
		
		Optional<User> user2 = findByEmail("hhh@naver.com");
//		try {
//			user2.orElseThrow(() -> new IllegalArgumentException("유저가 없어유"));
//		} catch (IllegalArgumentException e) {
//			user2.ifPresent(null);
//		}
		
		String notFound = user2.map(User::getName).orElse("유저가 존재하지 앖아유");
		System.out.println(notFound);
		
//		(1) 존재하는 이메일로 검색 → 있으면 "찾음: 이름(이메일)" 출력, 없으면 "없음" 출력 (ifPresentOrElse 사용)
		//
//			(2) 존재하지 않는 이메일로 검색 → 기본 유저(이름:"guest", 이메일:"guest@example.com")로 대체하여 출력 (orElse 사용)
		//
//			(3) 존재하지 않는 이메일로 검색 → 예외 발생(IllegalStateException("유저 없음")) 후 try-catch로 메시지 출력 (orElseThrow 사용)
		//
//			(4) 존재하는 이메일로 검색 → map(User::getName)으로 이름만 꺼내서 출력. 값 없으면 "이름 없음" 출력 (orElse 사용)

		
		
		
	}
	
	
	
	
	
	
}
