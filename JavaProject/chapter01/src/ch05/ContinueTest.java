package ch05;

public class ContinueTest {

	public static void main(String[] args) {
		
		// 예약어 continue
		// 무시하고 진행하는 continue
		
		int num;
		int count = 0;
		// 상수 2개 만들어봅시다.
		final int MAX = 1000;
		final int MULTIPLE = 8;
		
		for(num = 1; num <= MAX; num++ ) {
			
			// 3의 배수이면 출력하지마시오.
			if(num % MULTIPLE == 0) {
				count++;
				continue; // <-- 출력하지않게만든다.
			}
			// System.out.println("출력값 : " + num);
			
		}// end of for
		
		System.out.println("3의 배수 개수는 :" + count);
		
	}// end of main
}
