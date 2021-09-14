package ch08;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	final static int LOTTO_NUMBER_SIZE = 6;
	// 자주 사용하니 상수에 담기
	
	public int[] getLottoNumber() {
		
		// 번호를 담을 공간 만들기
		
		int[] numbers = new int[LOTTO_NUMBER_SIZE];
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1; // <= 0 발생 x
			numbers[i] = selectedNumber;
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i = i - 1;
					break;
					// 같은 숫자 나오기 x
				}
			} // end of for -j
		} // end of for - i
		
		Arrays.sort(numbers); // 배열 정리 (작은숫자부터 큰숫자)
		return numbers;
				
	}
	public static void main(String[] args) {
		/*
		// Tset Code
		int[] nums = LottoNumber.getLottoNumber();
		for (int i : nums) {
			System.out.println("i : " + i);
		}
		*/
	}
}
















