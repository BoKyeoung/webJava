package ch03;

public class MainTest {

	public static void main(String[] args) {
	
		Acitivity1 acitivity1 = new Acitivity1("ù��° ȭ���Դϴ�.");
		Acitivity2 acitivity2 = new Acitivity2("�ι�° ȭ���Դϴ�.");
		// �ݹ� �޼���� �����ϴ� ���
		
		acitivity2.setCallbackCheakPosition(acitivity1.callbackCheakPosition);

	}

}
