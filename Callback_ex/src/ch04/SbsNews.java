package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SbsNews implements WriteArticle{
	
	private String printDate() {
		
		// ��¥ ������ String���� ��ȯ�ϱ� ���� ���� ����
		DateFormat formater = new SimpleDateFormat("MM.dd.yyyy");
		return formater.format(Calendar.getInstance().getTime());
	}

	@Override
	public void printArticle(String article) {
		System.out.println("*** SBS News ***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("��� �ۼ��� : " + printDate());
		
	}
}