package ch03;

public class MainTest7 {

	public static void main(String[] args) {
		
		// ���� ���� ������
		// ���� �����ڿ� �ٸ� �����ڰ� �Բ� ���
		
		int num1 = 1;
		// num1 = num1 + 10;
		num1 += 10;
		System.out.println(num1);
		
		System.out.println("===============");
		
		int num2 = 1;
		// num2 = num2 - 10;
		// ���� -> ���մ��Կ����ڷ� �������ּ���.
		num2 -=10;
		System.out.println(num2);
		
		System.out.println("================");
		num1 *= 2;
		System.out.println(num1);
		System.out.println("================");
		num2 /= 2;
		System.out.println(num2);
		System.out.println("================");
		num2 %= 2;
		System.out.println(num2);
		System.out.println("================");

	} // end of main

}
