package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������. ");

		int i;

		// ���� ó��
		try {
			i = System.in.read(); // �Է¹ޱ�.
			// ���

			System.out.println(i);
			System.out.println((char) i); // ����ϱ�.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
