package ch03;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 1
		// �� ���� ���� ���� �Ͽ� result1 ������ ���
		// ����� 30.5�� ��� �ϼ���.
		System.out.println("1������");
		int i = 10;
		double d = 20.5;
		double result1 = i+d;
		System.out.println(result1);
		System.out.println();
	
		// 2
		// result1 ������ ���������� ���� �� ��ȯ �ؼ� ����ϼ���
		System.out.println("2������");
		System.out.println((int)result1);
		System.out.println();
		
		// 3
		// i ������ ���� -1�� �� �� ����ϼ���
		// ��, ���� ������ ���
		System.out.println("3������");
		i--;
		System.out.println(i);
		System.out.println();
		
		// 4
		// d ������ ���� -20.5�� ��� �ϼ���
		// ��, d ������ ���� �������� ������
		System.out.println("4������");
		System.out.println(-d);
		System.out.println();
		
		// 5
		// ���� i�� d, ���� �����ڸ� ����ؼ� result2 ������
		// �����ϰ� ������ true ���� ��⵵�� ���� �����
		// ����ϼ���
		System.out.println("5������");
		boolean result2 = (i < d);
		System.out.println(result2);
		System.out.println();
		
		// 6
		// ���� result3�� �����ϰ�
		// num1�� num2 ������ ���� 50���� ū�� �� �����ڸ� ����ؼ� ����� ��� ����ϼ���
		System.out.println("6������");
		int num1 = 10;
		
		int num2 = 30;
		boolean result3 = (num1 > 50) && (num2 > 50);
		System.out.println(result3);
		System.out.println();
		
		// 7
		// num1�� num2 �� �� ū ���� ���� �����ڸ� ����ؼ�
		// max ������ ���� ��� ������ּ���
		// ��, ����� �ʱ�ȭ�� ���ÿ� ���ּ���
		System.out.println("7������");
		int max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
		System.out.println();
	}

}







