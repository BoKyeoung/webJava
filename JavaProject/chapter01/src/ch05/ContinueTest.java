package ch05;

public class ContinueTest {

	public static void main(String[] args) {
		
		// ����� continue
		// �����ϰ� �����ϴ� continue
		
		int num;
		int count = 0;
		// ��� 2�� �����ô�.
		final int MAX = 1000;
		final int MULTIPLE = 8;
		
		for(num = 1; num <= MAX; num++ ) {
			
			// 3�� ����̸� ����������ÿ�.
			if(num % MULTIPLE == 0) {
				count++;
				continue; // <-- ��������ʰԸ����.
			}
			// System.out.println("��°� : " + num);
			
		}// end of for
		
		System.out.println("3�� ��� ������ :" + count);
		
	}// end of main
}
