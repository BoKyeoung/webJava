package ch03;

public class MianTest3 {

	public static void main(String[] args) {
		
		// ����, ���� ������
		// ++ , --
		
		int num1 = 1;
		//num1 = num1 + 1;
		num1++; // ������
		System.out.println(num1);
		
		int num2 = 1;
		// num2 = num2 - 1;
		num2--; // ������
		System.out.println(num2);
		System.out.println("-----------");
		
		// ȥ�� ���� !!!
		// 1. ���� �����ڰ� �ڿ� �� ���
		int num3 = 10;
		int num4;
		
		num4 = num3++;
		System.out.println(num4);
		// num3(10) num4�� ���� ���� �����ϰ� �� �� num3(10) ���� 1 ����
		System.out.println("num3 �� ���� �� :" + num3);
		System.out.println("num3 �� ���� �� :" + num4);
		
		// 2. ���� �����ڰ� �տ� �� ���
		int num5 = 10;
		int num6 = ++num5;
		
		System.out.println("num5�� ���� �� :" + num5);
		System.out.println("num6�� ���� �� :" + num6);
		
		// ��� : ���� �����ڴ� ����(����)�� �ִ� ���� 1 ���� ��ų ���̴�.
		// ��, �տ� ���� ���� �ڿ� ���� �� ������ ������ �ٸ���.
		

	}

}


















