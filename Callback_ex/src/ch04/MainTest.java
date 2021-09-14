package ch04;

public class MainTest {

	public static void main(String[] args) {
		
		// 해커 뉴스 객체 생성
		HackerNews hackerNews =  new HackerNews();
		
		// 기사 작성 
		MyArticle article = new MyArticle("오늘 날씨가 매우 덥습니다. ", hackerNews);	
		article.complete();

		System.out.println("=============");
		
		// SBS 클래스 만들기
		SbsNews sbsNews = new SbsNews();
		MyArticle article2 = new MyArticle("오늘 뉴스 특보입니다. ", sbsNews);
		article2.complete();
		
		System.out.println("=============");
		
		// MBC 클래스 만들기
		MbcNews mbcNews = new MbcNews();
		MyArticle article3 = new MyArticle("오늘의 뉴스입니다. ", mbcNews);
		article3.complete();
		
	}

}
