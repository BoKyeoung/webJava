package ch04;

import java.util.Scanner;

public class IfMainTest {

	// main�Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		// ��� if
		// �־��� ���ǿ� ���� ������ �̷�������� ����
		
		boolean flag = true;
		
		flag = false;
		
		// if�� �ܵ�
		if(flag) {
			System.out.println("���ǽ��� true�� ����˴ϴ�.");
		} // end of if
		
		// if else��
		if(flag) {
			System.out.println("true ����");
		}else {
			System.out.println("false ����");
		}
		
		// if else if else��
		
		System.out.println("������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		// crtl + shift + o -> import �ڵ� �ϼ�
		int point = sc.nextInt();
		
		if (point >= 90) {
			System.out.println("A �����Դϴ�.");
		}else if(point >= 80) {
			System.out.println("B �����Դϴ�.");
		}else if(point >= 70) {
			System.out.println("C �����Դϴ�.");
		}else if(point >= 60) {
			System.out.println("D �����Դϴ�.");
		}else {
			System.out.println("F �����Դϴ�.");
		}

	} // end of main

} // end of class












