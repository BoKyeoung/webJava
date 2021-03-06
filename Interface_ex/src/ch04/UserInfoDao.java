package ch04;

// 최고 선임 개발자가 인터페이스를 설계해서 클라이언트쪽 코딩을 맡김.
// 동기, 동료한테 DB쪽 연결 코딩을 맡김.

// 인터페이스는 (규약, 약속)을 만들어 놓지 않는다면, 한쪽 개발자가 작업이 끝날때까지 기다려야함.
// 즉, 개발 시간 증가 --> 개발 비용 증가

public interface UserInfoDao {

	// 클라이언트 개발자는 매개변수로 UserInfo 객체만 넘겨주면 된다.
	// DB 개발자도 UserInfo 객체만 넘겨받아서 코딩 진행
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
}
