package member;

public class MemberDAO {
		//현재는 코드가 (servlet,jsp) 생소하여 어려우니 JDBC를 연동 X 나중에 연습해보기.
	
		//id와 pw를 파라메터로 입력받아 id가 user, pw=>user1234 인 경우 true
	// 그외에는 false를 리턴하는 isLogin 메소드를 구현해보기
	String id;
	String pw;
	
	public boolean isLogin(String id,String pw) {
		if(id.equals("user")&&(pw.equals("user1234"))) {
			return true;
		}
		
		return false;
		
	}
	
}
