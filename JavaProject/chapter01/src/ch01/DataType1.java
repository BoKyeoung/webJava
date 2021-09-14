package ch01;

public class DataType1 {
	
	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 데이터 타입의 종류
		// 1. 기본 자료형 (primitive data type) -> 8가지
		// 2. 참조타입 (Reference type)
		
		// 기본 자료형 
		// 정수형 ( 1, 10, 100 )
		// 크기가 다르다 (담을 수 있는 숫자에 크기게 제한되어있다.)
		byte b;  // 1바이트 (8비트)  -128 ~ 127 의 숫자만 담을 수 있다.
		short s; // 2바이트 (16비트)
		int i;   // 4바이트 (32비트)
		long l;  // 8바이트 (64비트)
		
		b = 127;
		//b = 128;
		b = -128;
		//b = - 129;
		
		// int 의 상자 안에 담을 수 있는 정수값의 크기는 약 +- 21억 정도 이다.
		i = 2100000000;
		l = 2200000000l;
		l = 2300000000L; // <-- 대문자 L 을 사용하길 권장

	} // end of main

} // end of class
