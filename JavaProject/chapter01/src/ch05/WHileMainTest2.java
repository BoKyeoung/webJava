package ch05;

public class WHileMainTest2 {

	public static void main(String[] args) {
		
		// 1���� 10���� ���ؼ� �� ������� ���
		int num = 1;
		int sum = 0; // <-- ����� ���
		final int LIMIT_VALUE = 10;
		// while���� ����ؼ� 1���� 10���� ���� ����� ����غ�����.
		
		while(num <= LIMIT_VALUE) {
			sum = sum + num;
			num = num + 1;
			// num++
		}
		System.out.println("����� : " + sum);
	}

}
