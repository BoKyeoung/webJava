package ch04;

import java.util.Scanner;

public class UserInfoClient {

	// DBTYPE ����
	// public static String DBTYPE = "MYSQL";
	// public static String DBTYPE = "ORACLE";
	public static String DBTYPE = "MSSQL";
	
	// main �Լ�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ��������� userInfo ������ �޽��ϴ�.
		UserInfo userInfo = new UserInfo();
//		userInfo.setUserName("�����");
//		userInfo.setUserId("myUsetId");
//		userInfo.setPassword("123456!!");
		
		// ��ĳ�� �̿�
		System.out.println("����� �̸� �Է� : ");
		userInfo.setUserName(sc.nextLine());
		System.out.println("����� ID �Է� : ");
		userInfo.setUserId(sc.nextLine());
		System.out.println("����� PW �Է� : ");
		userInfo.setPassword(sc.nextLine());
		
		UserInfoDao userInfoDao = null;
		// �� �����ؾ��� if�� ������ �����ڵ带 �ۼ� ���� ��
		if(DBTYPE.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}else if(DBTYPE.equals("ORACLE")){
			userInfoDao = new UserInfoOracleDao();
		}else {
			userInfoDao = new UserInfoMssqlDao();
		}
		
		// 1. ȸ�������̶��
		userInfoDao.insertUserInfo(userInfo);
		
		// 2. ȸ�����������̶��
		userInfoDao.updateUserInfo(userInfo);
		
		// 3. ȸ�� Ż��, ����
		userInfoDao.deleteUserInfo(userInfo);
		
		
	}
	
}
