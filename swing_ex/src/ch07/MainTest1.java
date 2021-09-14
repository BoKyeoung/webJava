package ch07;

import java.util.Arrays;
import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {
		
		int[] numbers = new int[6];
		Random random = new Random();
		
		// 랜덤번호
		for (int i = 0; i < numbers.length; i++) {
			
			int selectedNumber = random.nextInt(45) + 1; // 0 은 출력되선 안되기 때문
			numbers[i] = selectedNumber;
			
			// i -> 0
			// i -> 1 ( 번호가 두개 담겨진 상태 ) (3, 3)
			for(int j = 0; j < i; j++) {
				
				if(numbers[i] == numbers[j]) {
					
					i = i - 1;
					break;
					
				}
				
			}
			
		} // end of for - i
		
		Arrays.sort(numbers);
		
		for (int i : numbers) {
			System.out.println("생성된 값 : " + i);
		}
		

	}

}
