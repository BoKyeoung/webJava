package ch05;

public class ForMainTest3 {

	public static void main(String[] args) {
		// 이중 for문
		
		// 2. j값이 2 ~ 9 까지 반복문을 만들어 보세요.
		for(int j = 2; j <= 9; j++) {
			// 1. i 값이 1부터 9까지의 반복을 만들어봅시다.
			for(int i = 1; i <= 9; i ++) {
				System.out.println(j + " x " + i + " = " + (j * i));
			} // end of for - i
			System.out.println(); // 한 문단에 한 줄
		} // end of for - j		
	} // end of main

}
