package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import vo.MemberVO;

public class MemberDAO {
//	연결
	Connection connection;
	
//	2. 쿼리 실행
	PreparedStatement preparedStatement;
	
//	3. 결과
	ResultSet resultSet;
	
//	4. 로그인 공용 저장소 세션
	public static Long session;
	
//	1) 아이디 중복 검사
	public boolean checkId(String memberEmail) {
//		- 연결
		connection = DBConnecter.getConnect();
//		- 쿼리를 작성한다
//		String query = "SELECT ID FROM TBL_MEMEBER WHERE MEMBER_EMAIL = \'" + memberEmail + "\'";
//		preparedStatement(상위호환)
		String query = "SELECT ID, MEMBER_EMAIL FROM TBL_MEMBER WHERE MEMBER_EMAIL = ?";
		boolean check = false;
		
//		- 쿼리를 보낸다
//		query는 try-catch를 강제한다.
		
		try {
//			연결
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, memberEmail);
//			- 데이터를 받는다(VO)
//			결과가 있으면 .executeQuery()
//			결과가 없으면 .executeUpdate()
//			resultSet = preparedStatement.executeQuery();
	        resultSet = preparedStatement.executeQuery();
			resultSet.next();
//			첫번째 아이디 Long 타입을 가져와
			Long id = resultSet.getLong(1);
			String memberName = resultSet.getString(2);
			System.out.println(id);
			System.out.println(memberName);
			
			
		} catch (SQLException e) {
//			못 찾았으면 
			check = true;
			System.out.println("checkId(String) Query문 오류" );
			e.printStackTrace();
		}finally {
//			열었던 순서 반대로 닫아준다.
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("리소스 해제 시 오류");
				e.printStackTrace();
			}
		}
//		리턴
		return check;
		
	}
	
//	회원가입
	public void join(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		
		String query = "INSERT INTO TBL_MEMBER" + "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setString(5, memberVO.getMemberAddress());
		} catch (SQLException e) {
			System.out.println("Join 쿼리문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("리소스 해제 시 오류");
				e.printStackTrace();
			}
		}
		
	}
	
//	로그인
	public boolean login(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
		boolean isLogin = true;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			
			
			session = resultSet.getLong(1);
			
		} catch (SQLException e) {
			isLogin = false;
			System.out.println("로그인 시 오류");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("리소스 해제 시 오류");
				e.printStackTrace();
			}
		}
		return isLogin;
	}
	
//	마이페이지
	public Optional<MemberVO> findById(MemberVO memberVO) {
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_ADDRESS " + "FROM TBL_MEMBER WHERE ID = ?";
		connection = DBConnecter.getConnect();
		
		MemberVO memberVO1 = new MemberVO();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			
			resultSet = preparedStatement.executeQuery();
			
//			행
			resultSet.next();
			memberVO1.setId(resultSet.getLong("ID"));
			memberVO1.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
			memberVO1.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
			memberVO1.setMemberName(resultSet.getString("MEMBER_NAME"));
			memberVO1.setMemberAge(resultSet.getInt("MEMBER_AGE"));
			memberVO1.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Optional.ofNullable(memberVO);
	}
	
	
//	로그인 전 비밀번호 변경
	public boolean changePassword(MemberVO memberVO, String memberNewPassword) {
//		String query = "SELECT ID FROM TBL_MEMBER WHERE id = ?";
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_PASSWORD = ? WHERE ID = ? AND WHERE EMAIL = ?";
		String updateQuery = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE ID = ?";
		boolean check = true;
		connection = DBConnecter.getConnect();
		
//		MemberVO memberVO2 = new MemberVO();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			Long foundId = resultSet.getLong("ID");
//			preparedStatement.executeUpdate();
			
			preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, memberNewPassword);
			preparedStatement.setLong(2, foundId);
			
			preparedStatement.executeUpdate();
			
//			resultSet.next();
			
			
		} catch (SQLException e) {
			check = false;
			System.out.println("비밀번호 변경 쿼리 오류");
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("리소스 오류");
				e.printStackTrace();
			}
		}
		return check;
	}
	
//	로그아웃
	public void logout() {
		session = null;
	}
	
//	로그인이 된 상태에서 회원정보 수정
	public boolean changeInfoOnLogin(MemberVO memberVO) {
//		String query = "SELECT ID FROM TBL_MEMBER WHERE ID = ?";
		String updatequery = "UPDATE TBL_MEMBER SET MEMBER_EMAIL = ? , MEMBER_NAME = ? ,MEMBER_ADDRESS = ? WHERE ID = ?";
		
		boolean check = true;
		connection = DBConnecter.getConnect();
		
		try {
//			preparedStatement = connection.prepareStatement(query);
			
//			preparedStatement.setLong(1, session);
			
//			resultSet = preparedStatement.executeQuery();
//			resultSet.next();
		
			preparedStatement = connection.prepareStatement(updatequery);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberName());
			preparedStatement.setString(3, memberVO.getMemberAddress());
			preparedStatement.setLong(4, session);
			preparedStatement.executeUpdate();
			
			
			
		} catch (SQLException e) {
			check = false;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return check;
	}
	
//	회원탈퇴
	public boolean outMember() {
		String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
		boolean check = true;
		connection = DBConnecter.getConnect();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			check = false;
			System.out.println("회원탈퇴 쿼리 오류 발생");
			e.printStackTrace();
		}finally {	x
			this.closeResources();
		}
		
		return check;
	}

private void closeResources() {
	try {
		if(resultSet != null) {
			resultSet.close();
		}
		if(preparedStatement != null) {
			preparedStatement.close();
		}
		if(connection != null) {
			connection.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	
}
}
