package ch01;

public class DataType2 {
	
	// 메인함수
	public static void main(String[] args) {
		
		// 기본 자료형
		// 문자 자료형
		char name; // 2바이트 공간에 문자를 담을 수 있는 데이터 자료형입니다.
		char a;
		char initial;
		
		// 값을 초기화 하는방법 (넣는방법)\
		name = 100;
		name = 'A'; // 홑 따옴표를 사용하고 하나의 글자만 변수에 저장할 수 있다.
		// name = 'AB';
		System.out.println(name);
		name = 'B';
		System.out.println(name);
		
		System.out.println("---------------");
		a = 'C';
		initial = 'D';
		System.out.println(a);
		System.out.println(initial);

	} // end of main

} // end of class
