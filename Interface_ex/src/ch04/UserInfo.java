package ch04;

// UserInfo 클래스를 만들어 줍니다. => 앱개발에 필수(bin class)
public class UserInfo {

	private String userId;
	private String password;
	private String userName;
	
	// 단축키 Alt + Shift + s , (getter/setter)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
