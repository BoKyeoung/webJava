package ch03;

public class MianTest3 {

	public static void main(String[] args) {
		
		// 증감, 감소 연산자
		// ++ , --
		
		int num1 = 1;
		//num1 = num1 + 1;
		num1++; // 간편함
		System.out.println(num1);
		
		int num2 = 1;
		// num2 = num2 - 1;
		num2--; // 간편함
		System.out.println(num2);
		System.out.println("-----------");
		
		// 혼동 주의 !!!
		// 1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		num4 = num3++;
		System.out.println(num4);
		// num3(10) num4에 먼저 값을 대입하고 난 뒤 num3(10) 값을 1 증가
		System.out.println("num3 의 현재 값 :" + num3);
		System.out.println("num3 의 현재 값 :" + num4);
		
		// 2. 증감 연산자가 앞에 올 경우
		int num5 = 10;
		int num6 = ++num5;
		
		System.out.println("num5의 현재 값 :" + num5);
		System.out.println("num6의 현재 값 :" + num6);
		
		// 결론 : 증감 연산자는 변수(공간)에 있는 값을 1 증가 시킬 뿐이다.
		// 단, 앞에 있을 때와 뒤에 있을 때 연산의 순서가 다르다.
		

	}

}


















