package ch03;

public class MainTest {

	public static void main(String[] args) {
	
		Acitivity1 acitivity1 = new Acitivity1("첫번째 화면입니다.");
		Acitivity2 acitivity2 = new Acitivity2("두번째 화면입니다.");
		// 콜백 메서드로 연결하는 방법
		
		acitivity2.setCallbackCheakPosition(acitivity1.callbackCheakPosition);

	}

}
