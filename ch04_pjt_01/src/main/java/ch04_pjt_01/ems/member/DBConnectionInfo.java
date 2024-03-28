package ch04_pjt_01.ems.member;

public class DBConnectionInfo {
	private String url;		//DB 연결을 위한 변수 생성
	private String userId;
	private String userPw;
	public DBConnectionInfo() {}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
}
