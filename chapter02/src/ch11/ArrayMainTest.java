package ch11;

public class ArrayMainTest {

	public static void main(String[] args) {
		
		// �迭
		// �迭�̶� ������ �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� ������ Ÿ���̴�.
		// ������ �ϳ��� �����͸� �����ϱ����� ���̶��, �迭�� �������� �����͸� �ϳ��� ������ �����ϱ� ���� ��
		
		int neumber = 10;
		
		// ���� ��� (���� �����)
		int[] arr1 = new int[3]; // �ǹ����� ��ȣ�ϴ� Ÿ��.
		int arr2[] = new int[10];
		
		// �ʱ�ȭ �ϴ� ��� (���� �ִ� ���)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		// �迭 ����� ���ÿ� �ʱ�ȭ �ϱ�
		int[] numbers1 = new int[] {11, 20, 33};
		int[] numbers2 = {10, 20, 100}; // ����ȭ
		
		// ��� ���
		System.out.println(numbers1[0]); // <-- ����϶�
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		
		// ���ڿ� �迭
		String[] strArr = new String[10];
		strArr[0] = "�߽���";
		strArr[1] = "��ũ��";
		strArr[2] = "������";
		strArr[3] = "���̶�";
		
		// ���� 1 strArr 0,1,2,3 ȭ�鿡 ��� ! ��, for�� ����������!
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		// ��� ���α׷��� ������ index 0���� �����մϴ�.
		// �迭�� ����Ҷ� ���� for���� �����ؼ� ���� ����մϴ�.
		
//		System.out.println(strArr.length);// <-- .length�� �迭�� ũ��
//		System.out.println(strArr[10]); 
		// �� ������ ���� : 0���� ���۵Ǳ⶧���� ���� ������ȣ�� 0 ~ 9
		// index�� ũ��� n - 1 �� �̴�.
		// new int[22];  �ε����� ũ��� 0 ~ 21
		// new int[74];  �ε����� ũ��� 0 ~ 73
		// new int[283]; �ε����� ũ��� 0 ~ 282
				
		System.out.println("==================");
		
		for(int i = 0; i < strArr.length; i++) {
//			if(strArr[i] == null) {
//				continue;
//			}else{
//				System.out.println(strArr[i]);
//			} �� �ڵ� ���̱�
			if(strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}// end of for - i
		

	}

}



















