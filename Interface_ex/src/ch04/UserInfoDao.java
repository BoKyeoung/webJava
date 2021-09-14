package ch04;

// �ְ� ���� �����ڰ� �������̽��� �����ؼ� Ŭ���̾�Ʈ�� �ڵ��� �ñ�.
// ����, �������� DB�� ���� �ڵ��� �ñ�.

// �������̽��� (�Ծ�, ���)�� ����� ���� �ʴ´ٸ�, ���� �����ڰ� �۾��� ���������� ��ٷ�����.
// ��, ���� �ð� ���� --> ���� ��� ����

public interface UserInfoDao {

	// Ŭ���̾�Ʈ �����ڴ� �Ű������� UserInfo ��ü�� �Ѱ��ָ� �ȴ�.
	// DB �����ڵ� UserInfo ��ü�� �Ѱܹ޾Ƽ� �ڵ� ����
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
}
