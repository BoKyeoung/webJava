package ch03;

public class MainTest7 {

	public static void main(String[] args) {
		
		// 복합 대입 연산자
		// 대입 연산자와 다른 연산자가 함께 사용
		
		int num1 = 1;
		// num1 = num1 + 10;
		num1 += 10;
		System.out.println(num1);
		
		System.out.println("===============");
		
		int num2 = 1;
		// num2 = num2 - 10;
		// 문제 -> 복합대입연산자로 수정해주세요.
		num2 -=10;
		System.out.println(num2);
		
		System.out.println("================");
		num1 *= 2;
		System.out.println(num1);
		System.out.println("================");
		num2 /= 2;
		System.out.println(num2);
		System.out.println("================");
		num2 %= 2;
		System.out.println(num2);
		System.out.println("================");

	} // end of main

}
