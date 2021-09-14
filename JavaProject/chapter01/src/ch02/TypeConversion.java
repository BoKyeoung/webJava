package ch02;

public class TypeConversion {

	public static void main(String[] args) {
		
		// 형 변환
		// 묵시적 형 변환 (자동 형 변환)
		// 명시적 형 변환 (강제 형 변환)
		
		// -> 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일 하는 것
		// int 자료형을 double 형으로 변경하거나 double형을 int로 변경하는 것 
		
		int iNum1 = 100;
		System.out.println(iNum1);
		
		// 자동 형 변환
		double dNum1 = iNum1;
		System.out.println(dNum1);
		
		// 강제 형 변환
		double dNumber = 1.12341;
		// int iNumber = dNumber; -> 오류 : 작은상제엇 큰 상자로 바로 넣을 수 없음.
		
		// 개발자 : 컴파일러야 괜찮으니까 그냥 강제로 넣어!!!
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
		// 소수점을 그냥 버리고 값을 저장
		
		// 연습
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		// bValue 출력 값은 얼마일까요?
		// 답 : 10
		System.out.println(bValue);
		

	}

}