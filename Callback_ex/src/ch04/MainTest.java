package ch04;

public class MainTest {

	public static void main(String[] args) {
		
		// ��Ŀ ���� ��ü ����
		HackerNews hackerNews =  new HackerNews();
		
		// ��� �ۼ� 
		MyArticle article = new MyArticle("���� ������ �ſ� �����ϴ�. ", hackerNews);	
		article.complete();

		System.out.println("=============");
		
		// SBS Ŭ���� �����
		SbsNews sbsNews = new SbsNews();
		MyArticle article2 = new MyArticle("���� ���� Ư���Դϴ�. ", sbsNews);
		article2.complete();
		
		System.out.println("=============");
		
		// MBC Ŭ���� �����
		MbcNews mbcNews = new MbcNews();
		MyArticle article3 = new MyArticle("������ �����Դϴ�. ", mbcNews);
		article3.complete();
		
	}

}
