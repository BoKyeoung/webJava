package ch05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		System.out.println("������ ������ �Է��ϼ��� : ");
		
		// input ���� 0 �� �ƴϸ� ��� �Է°��� ���� �� �ֵ��� ó���غ��ô�.
		do {
			// ���๮ 1
			input = sc.nextInt();
			// ���๮ 2
			sum = sum + input;
		}while(/*���ǽ�*/input != 0);// <-- 0�� �ƴҶ����� �ݺ�
			System.out.println("������� : " + sum);
	}

}
