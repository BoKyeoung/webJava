package ch03;

import java.util.Scanner;

public class MainTest6 {

	public static void main(String[] args) {
		
		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2;
		// 조건식의 결과값이 true면 결과1 반환, false면 결과2 반환
		
		int num1 = (5 > 3) ? 10 : 20;
		System.out.println(num1);
		
		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2);
		
		// JDK 만들어준 도구
		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int x = sc.nextInt();
		System.out.println("입력 2 : ");
		int y = sc.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println("큰 숫자는 : " + max + "입니다.");

	} // end of main

} // end of class
