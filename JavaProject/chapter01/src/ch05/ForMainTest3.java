package ch05;

public class ForMainTest3 {

	public static void main(String[] args) {
		// ���� for��
		
		// 2. j���� 2 ~ 9 ���� �ݺ����� ����� ������.
		for(int j = 2; j <= 9; j++) {
			// 1. i ���� 1���� 9������ �ݺ��� �����ô�.
			for(int i = 1; i <= 9; i ++) {
				System.out.println(j + " x " + i + " = " + (j * i));
			} // end of for - i
			System.out.println(); // �� ���ܿ� �� ��
		} // end of for - j		
	} // end of main

}
