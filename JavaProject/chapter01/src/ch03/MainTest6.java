package ch03;

import java.util.Scanner;

public class MainTest6 {

	public static void main(String[] args) {
		
		// ���� ������
		// ���ǽ� ? ���1 : ���2;
		// ���ǽ��� ������� true�� ���1 ��ȯ, false�� ���2 ��ȯ
		
		int num1 = (5 > 3) ? 10 : 20;
		System.out.println(num1);
		
		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2);
		
		// JDK ������� ����
		int max;
		System.out.println("�Է� ���� �� ���� ū ���� ����ϼ���!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� 1 : ");
		int x = sc.nextInt();
		System.out.println("�Է� 2 : ");
		int y = sc.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println("ū ���ڴ� : " + max + "�Դϴ�.");

	} // end of main

} // end of class