package ch10;

public class MainTset2 {

	public static void main(String[] args) {
		// 배열 : 연관된 데이터를 통으로 모아서 관리하기 위한 것
		int[] num = new int[12];

		Zealot[] zealots = new Zealot[12];

		// 배열을 for문과 함께 많이 사용.

		for (int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("질럿 " + (i + 1));
		} // 블록의 유효범위
		
		// 문제 showInfo - for문 사용해서 출력
		
		for (int i = 0; i < zealots.length; i++) {
			zealots[i].showInfo();
		}

	}

}
