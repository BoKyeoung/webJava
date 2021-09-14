package ch05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		System.out.println("덧셈값 정수를 입력하세요 : ");
		
		// input 값이 0 이 아니면 계속 입력값을 받을 수 있도록 처리해봅시다.
		do {
			// 수행문 1
			input = sc.nextInt();
			// 수행문 2
			sum = sum + input;
		}while(/*조건식*/input != 0);// <-- 0이 아닐때까지 반복
			System.out.println("결과값은 : " + sum);
	}

}
