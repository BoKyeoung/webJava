package ch02;

public class ForMainTest1 {

	// ���� �Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println("��");
		System.out.println("��");
		System.out.println("--------");
		
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			} // end of for - j
			System.out.println();
		} // end of for - i
		
		// i�� ������ = �ݺ��Ǵ� Ƚ��(*�� ������ Ƚ��), j�� ������ = *�� �ݺ���

	} // end of main

}