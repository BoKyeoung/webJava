package ch02;

public class ConstantTest {

	// ���� �Լ�
	public static void main(String[] args) {
		
		// ��� (constant)
		// ����� ������ �ʴ� ��. ex)������ 3.14, 1�� 12����
		// final ���� ����Ͽ� ����
		// ������� �빮�ڷ� ǥ��
		
		final int MAX_NUM = 12; // ����� ����� �ʱ�ȭ�� ���ÿ�
		// MAX_NUM = 10; --> ����� ���� �ѹ� �ʱ�ȭ(������)�ϸ� �ٽ� ������ �� ����.
		
		final int MIN_NUM; // ����
		MIN_NUM = 0;       // �ʱ�ȭ
		
		final int MY_COUNT = 100;
		// 1. ������ ����� ��� ���ϴ� �ɱ��?
		// ��. MY_COUNT
		// 2. ������ ��� ��� �ϱ��?
		// ��. final, int
		// 3. ���ͷ��� ��� ���ϴ°ɱ��.
		// ��. 100

	} // end of main

} // end of class
