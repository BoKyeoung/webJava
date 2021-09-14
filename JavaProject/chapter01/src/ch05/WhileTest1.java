package ch05;

public class WhileTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		int num = 1;
		
		while(num < 100) {
			System.out.println("현재 값 : " + num);
			num++; // <-- 필수
			Thread.sleep(1000); // <-- 값이 나오는 속도 조절
		}

	}

}
