package ch10;

public class MainTset2 {

	public static void main(String[] args) {
		// �迭 : ������ �����͸� ������ ��Ƽ� �����ϱ� ���� ��
		int[] num = new int[12];

		Zealot[] zealots = new Zealot[12];

		// �迭�� for���� �Բ� ���� ���.

		for (int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("���� " + (i + 1));
		} // ������ ��ȿ����
		
		// ���� showInfo - for�� ����ؼ� ���
		
		for (int i = 0; i < zealots.length; i++) {
			zealots[i].showInfo();
		}

	}

}