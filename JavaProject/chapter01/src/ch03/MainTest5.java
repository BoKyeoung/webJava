package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		
		// �� ������ ( &&, || ) ���ۼ�Ʈ, ��Ƽ�� ��
		// ���� �����ڿ� ȥ���ؼ� ���� ���
		// ������ ����� true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. �� ��
		// �� �� ��� true���� ���갪�� true�� ��ȯ
		//               �� true        �� true
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		//               �� true        �� false
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		
		// 2. �� ��
		// �� �� �� �ϳ��� true���� ���� ���� true�� ��ȯ
		//      		 �� true        �� true
		boolean flag3 = (num1 > 0) || (num2 > 0);
		System.out.println(flag3);
		//      		 �� false       �� true		
		boolean flag4 = (num1 < 0) || (num2 > 0);
		System.out.println(flag4);
		
	}

}
