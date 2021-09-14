package ch02;

public class ConstantTest {

	// 메인 함수
	public static void main(String[] args) {
		
		// 상수 (constant)
		// 상수는 변하지 않는 수. ex)원주율 3.14, 1년 12개월
		// final 예약어를 사용하여 선언
		// 상수명은 대문자로 표기
		
		final int MAX_NUM = 12; // 상수를 선언과 초기화를 동시에
		// MAX_NUM = 10; --> 상수는 값을 한번 초기화(넣으면)하면 다시 변경할 수 없다.
		
		final int MIN_NUM; // 선언
		MIN_NUM = 0;       // 초기화
		
		final int MY_COUNT = 100;
		// 1. 위에서 상수는 어디를 말하는 걸까요?
		// 답. MY_COUNT
		// 2. 예약어는 어디 어디 일까요?
		// 답. final, int
		// 3. 리터럴은 어디를 말하는걸까요.
		// 답. 100

	} // end of main

} // end of class
