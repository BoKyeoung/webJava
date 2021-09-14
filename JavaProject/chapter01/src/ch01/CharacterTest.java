package ch01;

public class CharacterTest {
	
	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		// char 타입은 음수값은 대입 불가; 문자는 양수로만 표현 가능
		// char ch3 = -67;
		
		char ch4 ='한';
		System.out.println((int)ch4);
		
		// 문제 1, 안, 녕, 하, 세, 요
		// 각각의 문자들을 정수값으로 하나씩 출력해보세요.
		
		char ch5 ='안';
		System.out.println((int)ch5);
		char ch6 ='녕';
		System.out.println((int)ch6);
		char ch7 ='하';
		System.out.println((int)ch7);
		char ch8 ='세';
		System.out.println((int)ch8);
		char ch9 ='요';
		System.out.println((int)ch9);

	} // end of main

} // end of class

