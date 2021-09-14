package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요. ");

		int i;

		// 예외 처리
		try {
			i = System.in.read(); // 입력받기.
			// 출력

			System.out.println(i);
			System.out.println((char) i); // 출력하기.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
