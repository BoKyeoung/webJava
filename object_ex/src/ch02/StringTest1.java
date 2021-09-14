package ch02;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String ���� ���
		// heap �޸𸮿� �ν��Ͻ��� �����Ǵ� ��� ( new => heap������ ���� )
		String str1 = new String("ABC");
		
		// constant pool (Data, static) �� �ּҸ� �����ϴ� ���
		String str2 = "ABC";
		
		// ��� : heap�޸𸮴� ������ �� ���� �ٸ� �ּ� ���� ��������, ��� Ǯ�� ������ ���ڿ��� ��� ���� �ּҰ��� ������ �ȴ�.
		// ���� ������ : == (����)
		
		// str1�� �ּҰ��� �ٸ�
		String str3 = new String("ABC");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		String str4 = "ABC";
		String str5 = "ABC";
		
		System.out.println(str4 == str5);
		
	}
	
}
