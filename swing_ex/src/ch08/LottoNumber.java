package ch08;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	final static int LOTTO_NUMBER_SIZE = 6;
	// ���� ����ϴ� ����� ���
	
	public int[] getLottoNumber() {
		
		// ��ȣ�� ���� ���� �����
		
		int[] numbers = new int[LOTTO_NUMBER_SIZE];
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1; // <= 0 �߻� x
			numbers[i] = selectedNumber;
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i = i - 1;
					break;
					// ���� ���� ������ x
				}
			} // end of for -j
		} // end of for - i
		
		Arrays.sort(numbers); // �迭 ���� (�������ں��� ū����)
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
















