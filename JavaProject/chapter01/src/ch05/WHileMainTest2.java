package ch05;

public class WHileMainTest2 {

	public static void main(String[] args) {
		
		// 1부터 10까지 더해서 그 결과값을 출력
		int num = 1;
		int sum = 0; // <-- 결과값 담기
		final int LIMIT_VALUE = 10;
		// while문을 사용해서 1부터 10까지 덧셈 결과를 출력해보세요.
		
		while(num <= LIMIT_VALUE) {
			sum = sum + num;
			num = num + 1;
			// num++
		}
		System.out.println("결과값 : " + sum);
	}

}
