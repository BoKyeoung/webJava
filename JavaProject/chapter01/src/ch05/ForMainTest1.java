package ch05;

public class ForMainTest1 {
	
	
	public static void main(String[] args) {
	
	/*
	 * for(초기화식; 조건식; 증감식) { 
	 * 	수행문; 
	 * }
	 */
		// for문을 이용해서 1부터 10까지 덧셈 연산
		// 연산에 결과를 담을 변수가 필요함.
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("현재 i 값은 : " + i);
			sum = sum + i;
		}
		System.out.println("======================");
		System.out.println("최종 결과값 : " + sum);
		// 최종결과가 왜 55지?
		
	} // end of main
}
