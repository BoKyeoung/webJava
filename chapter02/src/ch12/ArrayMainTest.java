package ch12;

public class ArrayMainTest {

	// main 함수(코드의 시작점)
	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");
		
		// 문제
		// 배열을 이용해서 shoppingCart 변수에 담아 봅시다.
		// 1. 배열을 선언하고 크기를 10으로 만들어봅시다.
		Book[] shoppingCart = new Book[10];
		
		// 2. 사고싶은 책을 장바구니에 담아봅시다 (3개)
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		
		// 3. 장바구니에 담은 정보를 화면에 출력하세요.
		for(int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
				
			}
		}
		
		// 4. 0번째 인덱스에 선택하지 않은 책을 추가하고 기존에 있던
		// [0], [1], [2] 
		shoppingCart[0] = book2;
		shoppingCart[1] = book1;
		shoppingCart[2] = book3;
		shoppingCart[3] = book4;
		
		System.out.println("=============");
		
		// 확장 for문
		for (Book book : shoppingCart) {
			// 만약에 null이 아니라면 출력해주세요.
			if(book != null) {
				book.showInfo();
			}
		}
		
		System.out.println("=============");
		
		// 인덱스 3번을 지워보세요
		shoppingCart[3] = null;
		
		// 확장 for문
		for(Book abg : shoppingCart) {
			// 방어적 코드
			if(abg != null) {
				abg.showInfo();
			}
		}
		

	} // end of main

} // end of class



















