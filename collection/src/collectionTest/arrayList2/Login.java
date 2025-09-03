package collectionTest.arrayList2;

public class Login {
	public static void main(String[] args) {
		UserField userField = new UserField();
		
		// 회원가입
		User user = new User("taeheecafe" , "이태희", "1234", "10157051641");
		userField.join(user); //버튼
		System.out.println(DBconnecter.users);
		
		// 로그인
		User userForLogin = new User("taeheecafe" , "이태희", "1234", "10157051641");
		
		if(userField.login(userForLogin)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		//비밀번호 변경
		userForLogin.setPassword("12345");
		userField.update(userForLogin);
		
		
		//로그아웃
		userField.logout();
		System.out.println(userField.userId);
	}
}
