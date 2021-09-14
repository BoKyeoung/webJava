package ch02;

public class StringTest2 {

	public static void main(String[] args) {
		
		// �ѹ� ������ String�� �Һ�(immutable)
		
		// String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ� ���ο� ���ڿ��� �����ȴ�.
		
		String java = new String("java");
		String android = new String("Android");
		
		// String ������ �ּҰ��� Ȯ���ϰ� �ʹٸ�
		System.out.println(java); // <= �Է°� ����
		System.out.println(System.identityHashCode(java)); // <= �ּҰ� Ȯ�� ����
		System.out.println(android);
		
		System.out.println("============================");
		// java = java + android;
		java = java.concat(android); // .concat => ���϶� ��.
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // <= �ּҰ� ����
		
		
	}
}
