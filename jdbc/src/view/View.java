package view;

import java.util.Optional;

import dao.MemberDAO;
import exception.MemberNotFoundException;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
		memberVO.setMemberEmail("karina123");
		memberVO.setMemberPassword("1234");
		memberVO.setMemberName("카리나");
		memberVO.setMemberAge(22);
		memberVO.setMemberAddress("서울시 강남구");
		
//		String newPassword = "12345";
	
		
//		Optional<MemberVO> foundMember = memberDAO.findById(memberVO);
//		foundMember.ifPresent(System.out::println);
		
		if(memberDAO.changePassword(memberVO, "testPW")) {
			System.out.println("변경 완료");
		}else {
			System.out.println("실패");
		}
//		MemberVO member = foundMember.orElseThrow(() -> {
//			throw new MemberNotFoundException();
//		})
		
		
		if(memberDAO.login(memberVO)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		if(memberDAO.changeInfoOnLogin(memberVO)) {
			System.out.println("회원수정 완료");
		}else {
			System.out.println("회원수정 실패");
		}
		
		if(memberDAO.outMember()) {
			System.out.println("탈퇴완료");
		}else {
			System.out.println("탈퇴 실패");
		}
	}
}


