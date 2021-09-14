package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		char result = 'X';
		
		// 문제
		// 100점 보다 작고 90점 보다 크거나 같으면 result = 'A'
		// 90점 보다 작고 80점 보다 크거나 같으면 result = 'B'
		// 80 ~ 70 'C'
		// 70 ~ 60 'D'
		// 60 ~ 0  'F'
		// 위에 조건에 아무것도 해당하지 않는다면 "화면에 잘못된 입력이 있습니다."
		// 마지막 result 값이 X 가 아니라면 "당신의 학점은 A ~ F 입니다.
		if(point < 100 && point >= 90 ) {
			System.out.println("A 학점입니다.");
		}else if(point < 90 && point >= 80) {
			System.out.println("B 학점입니다.");
		}else if(point < 80 && point >= 70) {
			System.out.println("C 학점입니다.");
		}else if(point < 70 && point >= 60) {
			System.out.println("D 학점입니다.");
		}else if(point < 60 && point >= 0) {
			System.out.println("F 학점입니다.");
		}else {
			System.out.println("화면에 잘못된 입력이 있습니다.");
		}
		
		if(result != 'X') {
			System.out.println("당신의 학점은 : " + result + "입니다.");
		} // 이거 왜만든거지.? != 머더라.
		
		
	} // end of main

}







