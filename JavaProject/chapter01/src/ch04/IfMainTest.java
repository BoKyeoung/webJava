package ch04;

import java.util.Scanner;

public class IfMainTest {

	// main함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 제어문 if
		// 주어진 조건에 따라서 실행이 이루어지도록 구현
		
		boolean flag = true;
		
		flag = false;
		
		// if문 단독
		if(flag) {
			System.out.println("조건식이 true면 실행됩니다.");
		} // end of if
		
		// if else문
		if(flag) {
			System.out.println("true 실행");
		}else {
			System.out.println("false 실행");
		}
		
		// if else if else문
		
		System.out.println("성적을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		// crtl + shift + o -> import 자동 완성
		int point = sc.nextInt();
		
		if (point >= 90) {
			System.out.println("A 학점입니다.");
		}else if(point >= 80) {
			System.out.println("B 학점입니다.");
		}else if(point >= 70) {
			System.out.println("C 학점입니다.");
		}else if(point >= 60) {
			System.out.println("D 학점입니다.");
		}else {
			System.out.println("F 학점입니다.");
		}

	} // end of main

} // end of class












