package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// return; // ������ ���Ϲ��� �־ finally�� �����.
			// ����� ��ȯ, ���� �ݳ�, 		
		} catch(Exception e) {
			e.printStackTrace();                     
		} finally {
			// try���� ����Ǹ� �ݵ�� ���� ��.
			System.out.println("���⵵ ������ �ǳ���?");
		}
		
	}

}
