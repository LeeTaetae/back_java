package collectionTest.arrayList2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

//import mail.mailTest;
public class UserField {
	// DB
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
	public static String code;
	final int KEY = 300;
	
	// 아이디 검사
	public User checkId(String id) {
		// id를 받아서 db에 있는 아이디가 있는지 아닌지를 검사한다.
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user; //true 또는 false로 리턴하게 되면 회원가입, 로그인 등등을 할 때 한번 더 검사함. 
			}
		}
		return null;
	}
	
	public User checkPassword(String password) {
		for(User user : users) {
			if(user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
//		회원 가입
	public void join(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb == null) {
			users.add(user);
		}
	}
	
//		로그인 
	public boolean login(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb != null) {
			if(userInDb.getPassword().equals(user.getPassword())) {
				userId = userInDb.getId();
				return true;
			}
		}
		return false;
	}
	
//		로그아웃
	public void logout() {
		userId = null;
	}
//		암호화
//	public void encode(User user) {
//		//비밀번호 확인
//		User userInDb = checkPassword(user.getPassword());
//		//비밀번호가 있는 경우, char로 받기
//		if(userInDb != null) {
//			char[] ch = userInDb.getPassword().toCharArray();
//			if()
//		}
		
//	}
	
	public String encrypt(String password) {
		String encryptPassword = "";
		for(int i = 0; i < password.length(); i++) {
			encryptPassword += (char)(password.charAt(i) * KEY);
		}
		return encryptPassword;
	}


//		비밀번호 변경(마이페이지)
	public void update(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb != null) {
			userInDb.setPassword(encrypt(user.getPassword()));
		}
		
	}
//		비밀번호 변경(비밀번호 변경 30일)
	public void update(String password, String newPassword) {
		User userInDb = checkId(userId);
		if(userInDb != null) {
			userInDb.setPassword(encrypt(newPassword));
		}
//		Date today = new Date();
//		Date month = new Date(today.getTime() + (long) (1000 * 60 * 60 * 24 * 30));
//		String newPassword1 = "";
//		String newPassword2 = "";
//	
//		
//		do {
//			System.out.println("비밀번호를 변경해주세요.");
//			if(!password.equals(newPassword1) && newPassword1.equals(newPassword2)) {
//				System.out.println("비밀번호가 변경되었습니다.");
//			}else {
//				System.out.println("비밀번호를 다시 확인하세요.");
//			}
//		}while(month != null);
	}
	
//		인증번호 생성
	public String randomNumber() {
		String code = "";
		for(int i = 0; i < 6; i++) {
			code += (int)(Math.random() * 10);
			this.code = code;
		}
		return code;
	}
	
//		인증번호 전송
	public void sendEmail(String toMemberEmail) {
		 // 메일 인코딩
        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
        
        //원하는 메일 제목 작성
        String subject = "메일 발송 테스트";
        
        //보낸 이메일 작성
        String fromEmail = "taeheecafe@gmail.com";
        String fromUsername = "태희, 예성";
        
        String toEmail = "taeheecafe@gmail.com"; // 콤마(,)로 여러개 나열
        
        //도메인 사용할 필요 없다
        //앱비밀번호
        final String username = "taeheecafe@gmail.com";         
        final String password = "szwn ldlf bmoc iwnr";
        
        // 메일에 출력할 텍스트
        String html = null;
        StringBuffer sb = new StringBuffer();
        sb.append("<h3>인증번호 발송</h3>\n");
        sb.append("<h4>[인증번호 6자리]</h4>\n");  
        sb.append("<h4>" + code + "</h4>\n");  
        sb.append("<h4> 코드발송 완료 </h4>");
        html = sb.toString();
        
        // 메일 옵션 설정
        Properties props = new Properties();    
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        try {
          // 메일 서버  인증 계정 설정
          Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
            }
          };
          
//          MailTest mail = new MailTest();
//          String myMessage = mail.sendToMessage();
//          // 메일 세션 생성
          Session session = Session.getDefaultInstance(props, auth);
          
          // 메일 송/수신 옵션 설정
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail, fromUsername));
          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
          message.setSubject(subject);
          message.setSentDate(new Date());
          
//          // 메일 콘텐츠 설정
          Multipart mParts = new MimeMultipart();
          MimeBodyPart mTextPart = new MimeBodyPart();
          MimeBodyPart mFilePart = null;
 //    
//          // 메일 콘텐츠 - 내용
          mTextPart.setText(html, bodyEncoding, "html");
          mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
          message.setContent(mParts);
     
          // 메일 발송
          Transport.send( message );
          
        } catch ( Exception e ) {
          e.printStackTrace();
        }
	}
	
//		인증번호 확인
	public boolean checkCode(String inputCode) {
		return code.equals(inputCode);
	}
	
	public static void main(String[] args) {
		UserField uf = new UserField();
		Scanner sc = new Scanner(System.in);	
		String message = "인증번호를 입력하세요. \nex)75555", inputCode = null;
		int errorCode = 0;
		
		System.out.println(uf.encrypt("ADDFdsd"));
		uf.randomNumber();
		uf.sendEmail("taeheecafe@gmail.com");
		
		do {
			System.out.println(message);
			inputCode = sc.nextLine().trim();

			if(errorCode == 0) {
				System.out.println(message);
				inputCode = sc.nextLine().trim();
			}else if(errorCode > 0) {
				errorCode++;
				System.out.println("다시 입력하세요.");
				inputCode = sc.nextLine().trim();
			}else if(errorCode == 3){
				System.out.println("처음부터 다시 인증하세요.");
				break;
			}
		}while(!uf.checkCode(inputCode));
		
		if(uf.checkCode(inputCode)) {
			System.out.println("인증 완료");
		}else {
			System.out.println("인증 실패");
		}
	}
}
