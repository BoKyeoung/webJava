package ch02;

public class MainTest {

	public static void main(String[] args) {
		Activaity1 activaity1 = new Activaity1("��Ƽ��Ƽ1");
		Activaity2 activaity2 = new Activaity2("��Ƽ��Ƽ2");
		// �޼��带 ����ؼ� �ݹ� �����ϱ�
		activaity2.setCallbackCheakPosition(activaity1.callbackCheakPosition);

	}

}
