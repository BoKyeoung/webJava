package ch04;

public class UserInfoMssqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Mssql : �����ϱ�" + userInfo.getUserName());
		System.out.println("Mssql : �����ϱ�" + userInfo.getUserId());
		System.out.println("Mssql : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Mssql : �����ϱ�" + userInfo.getUserName());
		System.out.println("Mssql : �����ϱ�" + userInfo.getUserId());
		System.out.println("Mssql : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Mssql : �����ϱ�" + userInfo.getUserName());
		System.out.println("Mssql : �����ϱ�" + userInfo.getUserId());
		System.out.println("Mssql : �����ϱ�" + userInfo.getPassword());
	}
	
}
