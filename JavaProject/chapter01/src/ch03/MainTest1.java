package ch03;

public class MainTest1 {

	// �����Լ�
	public static void main(String[] args) {
		
		// ���� ������ ( = )
		int number = 10;
		// ������ ������ �����ʿ��� �������� ������ �˴ϴ�. <-
		
		int number2 = number;
		// ������ ������ ������ ���� �ֽ��ϴ�.
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println("--------------");
		
		// ��ȣ ������ ( +, - )
		System.out.println(-number);
		// ��ȣ�� �����ϴ� ������
		// ��, ������ ����ִ� ���� ���� ������ ���´� �ƴմϴ�.
		System.out.println(number);
		System.out.println("-----------");
		// ������ ���� ���� �����Ϸ��� ���� �����ڸ� ����ؾ� �Ѵ�.
		number = -number;
		System.out.println(number);
		

	} // end of main

} // end of class
