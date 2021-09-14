package ch12;

import java.util.ArrayList;

public class ArrayListMainTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");
		
		// ArrayList
		// 사용방법
		
		// 데이터를 담을 공간 만들기
		// !ArrayList 배열과 달리 공간의 크기를 먼저 선언할 필요가 없다.
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		 
		// 추가 방법 1
		// 데이터 추가하기(값 넣기) 3개만 넣어봅시다.
		shoppingCart.add(book1); // [0]
		shoppingCart.add(book2); // [1]
		shoppingCart.add(book3); // [2]
		
		// 추가 방법 2
		shoppingCart.add(0, book3); // 자동으로 순서가 밀린대로 밀어줌.
		
		// 화면에 출력
		for(int i = 0; i < shoppingCart.size(); i++) { 
			// size(); = length, 
			// size = 메소드 호출 후 멤버값을 리턴, length = 멤버변수값을 호출
			shoppingCart.get(i).showInfo();
		}
		
		// 삭제하는 방법
		shoppingCart.remove(3);      // 하나씩 지우는 명령
		// 응용
		System.out.println("===============");
		// 사이즈 구하기
		int mySize = shoppingCart.size();
		System.out.println("MySize : " + mySize);
		// ArrayList의 크기는 : 3
		// ArrayList의 인덱스 크기는 : 2 , [0, 1, 2] n-1;
		// shoppingCart.remove(mySize); <= 오류
		// mySize의 크기 = 3, index의 크기 : 2, ▶ - 1 로 지우기
//		shoppingCart.remove(mySize - 1);
		// ▼ 코드 단축 ▼ = 한번만 알면되는 값이기 때문에 한번에 작성
//		shoppingCart.remove(shoppingCart.size() - 1);
		
		
		
		// shoppingCart.removeAll(); // 모두 지우는 명령
		System.out.println("===============");
		
		// 화면에 출력
		for(int i = 0; i < shoppingCart.size(); i++) { 
			shoppingCart.get(i).showInfo();
		}
		
		// 수정하기 set
		shoppingCart.set(1, book4);
		// => 1번 index를 변경하라
		
		System.out.println("==================");
		
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		// C R U D
		// create, read, update, delete
		
		
	} // end of main

} // end of class















