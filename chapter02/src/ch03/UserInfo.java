package ch03;

public class UserInfo {
	
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	int age;
	
	// ������ �����ε�
	// Alt + Shift + s --> ������ ����� ����Ű
	
	// ���� 1. �⺻ ������
	public UserInfo() {
	}
	
	// ���� 2. userId ���� �޴� ������ �����
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// ���� 3. userId, userPassWord
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	
	// ���� 4. userId, userPassWord, userName
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}

	// ���� 5. userId, userPassWord, userName, userAddres
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	// ���� 6. userId, userPassWord, userName, userAddres, phoneNumber
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		super();
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}

	// ���� 7. int ���� ������ ���� �����ڱ��� �����
	// -> int ������ ������ ����ؼ� ������
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber,
			int age) {
		super();
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	
	
	
	

}
