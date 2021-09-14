package ch02;

public class MainTest {

	public static void main(String[] args) {
		Activaity1 activaity1 = new Activaity1("액티비티1");
		Activaity2 activaity2 = new Activaity2("액티비티2");
		// 메서드를 사용해서 콜백 연결하기
		activaity2.setCallbackCheakPosition(activaity1.callbackCheakPosition);

	}

}
