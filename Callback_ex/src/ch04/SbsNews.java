package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SbsNews implements WriteArticle{
	
	private String printDate() {
		
		// 날짜 형식을 String으로 변환하기 위한 포맷 형식
		DateFormat formater = new SimpleDateFormat("MM.dd.yyyy");
		return formater.format(Calendar.getInstance().getTime());
	}

	@Override
	public void printArticle(String article) {
		System.out.println("*** SBS News ***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " + printDate());
		
	}
}
