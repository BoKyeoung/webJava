package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {
		
		System.out.println("������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		char result = 'X';
		
		// ����
		// 100�� ���� �۰� 90�� ���� ũ�ų� ������ result = 'A'
		// 90�� ���� �۰� 80�� ���� ũ�ų� ������ result = 'B'
		// 80 ~ 70 'C'
		// 70 ~ 60 'D'
		// 60 ~ 0  'F'
		// ���� ���ǿ� �ƹ��͵� �ش����� �ʴ´ٸ� "ȭ�鿡 �߸��� �Է��� �ֽ��ϴ�."
		// ������ result ���� X �� �ƴ϶�� "����� ������ A ~ F �Դϴ�.
		if(point < 100 && point >= 90 ) {
			System.out.println("A �����Դϴ�.");
		}else if(point < 90 && point >= 80) {
			System.out.println("B �����Դϴ�.");
		}else if(point < 80 && point >= 70) {
			System.out.println("C �����Դϴ�.");
		}else if(point < 70 && point >= 60) {
			System.out.println("D �����Դϴ�.");
		}else if(point < 60 && point >= 0) {
			System.out.println("F �����Դϴ�.");
		}else {
			System.out.println("ȭ�鿡 �߸��� �Է��� �ֽ��ϴ�.");
		}
		
		if(result != 'X') {
			System.out.println("����� ������ : " + result + "�Դϴ�.");
		} // �̰� �ָ������.? != �Ӵ���.
		
		
	} // end of main

}







