package ch02;

public class ForMainTest1 {

	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println("가");
		System.out.println("나");
		System.out.println("--------");
		
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			} // end of for - j
			System.out.println();
		} // end of for - i
		
		// i의 변수값 = 반복되는 횟수(*이 찍히는 횟수), j의 변수값 = *의 반복값

	} // end of main

}
