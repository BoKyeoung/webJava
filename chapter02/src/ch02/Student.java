package ch02;

import java.util.Random;

public class Student {

	// 객체의 속성은 멤버 변수로, 객체의 기능은 메서드로 구현한다.
	int studentId;
	String studentName;
	String address;
	
	// 메서드 정의
	public void study() {
		System.out.println(studentName + " 학생이 공부를 합니다.");
	} // end of study
	
	public void breakTime() {
		System.out.println(studentName + " 학생이 휴식을 합니다.");
	} // end of breakTime
	
	public void showInfo() {
		System.out.println(studentId + " , " + studentName + ", " + address);
	} // end of showInfo
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "김춘식";
		studentKim.studentId = 1;
		studentKim.address = "강원도 원주시";
		
		//메서드 호출
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		System.out.println("===================");
		
		Student studentLee = new Student();
		studentLee.studentName = "이춘식";
		studentLee.studentId = 2;
		studentLee.address = "부산시 남포동";
		
		// 문제 1. study() 메서드 호출
		studentLee.study();
		// 문제 2. breakTime() 메서드 호출
		studentLee.breakTime();
		// 문제 3. showInfo() 메서드 호출
		studentLee.showInfo();
		
		System.out.println("=========================");
		
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		
	} // end of main
	
	// 함수 만들기
	
	public static int randomNumber() {
		int value;
		Random random = new Random();
		value = random.nextInt(45) + 1; 
		// 0 ~ 44까지 랜덤으로 숫자를 반환 (+1 추가) -> 1 ~ 45 까지 숫자 중 하나를 반환.
		return value;
	}
	
}










