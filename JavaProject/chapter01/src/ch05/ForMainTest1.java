package ch05;

public class ForMainTest1 {
	
	
	public static void main(String[] args) {
	
	/*
	 * for(�ʱ�ȭ��; ���ǽ�; ������) { 
	 * 	���๮; 
	 * }
	 */
		// for���� �̿��ؼ� 1���� 10���� ���� ����
		// ���꿡 ����� ���� ������ �ʿ���.
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("���� i ���� : " + i);
			sum = sum + i;
		}
		System.out.println("======================");
		System.out.println("���� ����� : " + sum);
		// ��������� �� 55��?
		
	} // end of main
}
