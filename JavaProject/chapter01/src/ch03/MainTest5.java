package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		
		// 논리 연산자 ( &&, || ) 엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합해서 많이 사용
		// 연산의 결과가 true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. 논리 곱
		// 두 항 모두 true여야 연산값이 true로 반환
		//               ▼ true        ▼ true
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		//               ▼ true        ▼ false
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		
		// 2. 논리 합
		// 두 항 중 하나만 true여도 연산 값은 true로 반환
		//      		 ▼ true        ▼ true
		boolean flag3 = (num1 > 0) || (num2 > 0);
		System.out.println(flag3);
		//      		 ▼ false       ▼ true		
		boolean flag4 = (num1 < 0) || (num2 > 0);
		System.out.println(flag4);
		
	}

}
