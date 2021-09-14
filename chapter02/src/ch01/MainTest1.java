package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		// 값을 입력하고 출력까지 해봅시다.
		order1.orderId = 2534;
		order1.buyerId = "이순신";
		order1.sellerId = "충무김밥";
		order1.productId = 16000;
		order1.orderDate = "2021.08.23";
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println("=================");
		
		
		UserInfo userInfo1 = new UserInfo();
		// 값을 입력하고 출력까지 해봅시다.
		userInfo1.userId = "Cnstlr123";
		userInfo1.userPassWord = "Cnstlr1234";
		userInfo1.userName = "김춘식";
		userInfo1.userAddress = "강원도 원주";
		userInfo1.phoneNumber = 12345678;
		
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userPassWord);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.phoneNumber);
		System.out.println("=======================");
		
	}

}









