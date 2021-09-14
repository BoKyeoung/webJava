package ch04;

import java.util.Scanner;

public class UserInfoClient {

	// DBTYPE 설정
	// public static String DBTYPE = "MYSQL";
	// public static String DBTYPE = "ORACLE";
	public static String DBTYPE = "MSSQL";
	
	// main 함수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자한테 userInfo 정보를 받습니다.
		UserInfo userInfo = new UserInfo();
//		userInfo.setUserName("이춘식");
//		userInfo.setUserId("myUsetId");
//		userInfo.setPassword("123456!!");
		
		// 스캐너 이용
		System.out.println("사용자 이름 입력 : ");
		userInfo.setUserName(sc.nextLine());
		System.out.println("사용자 ID 입력 : ");
		userInfo.setUserId(sc.nextLine());
		System.out.println("사용자 PW 입력 : ");
		userInfo.setPassword(sc.nextLine());
		
		UserInfoDao userInfoDao = null;
		// ▲ 선언해야지 if문 내에서 동적코드를 작성 가능 ★
		if(DBTYPE.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}else if(DBTYPE.equals("ORACLE")){
			userInfoDao = new UserInfoOracleDao();
		}else {
			userInfoDao = new UserInfoMssqlDao();
		}
		
		// 1. 회원가입이라면
		userInfoDao.insertUserInfo(userInfo);
		
		// 2. 회원정보수정이라면
		userInfoDao.updateUserInfo(userInfo);
		
		// 3. 회원 탈퇴, 삭제
		userInfoDao.deleteUserInfo(userInfo);
		
		
	}
	
}
