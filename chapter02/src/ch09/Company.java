package ch09;

public class Company {
	
	// 1. �����ڸ� private�� �����.
	private Company() {
		
	}
	
	// 2. static ������ Ȱ���ؼ� ���ο��� ��ü�� �����Ѵ�.
	private static Company instance = new Company();
	
	// 3. �ܺο��� ������ �ν��Ͻ���(��ü) ������ �� �ִ� public �޼��带 ����
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}

}