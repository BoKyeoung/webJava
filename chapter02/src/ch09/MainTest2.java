package ch09;

public class MainTest2 {

	public static void main(String[] args) {
		
		// static Ŭ���� �̸����� ���ٰ����ϴ�.
		
		int tempNumber = Employee.getSerialNum();
		System.out.println(tempNumber);
		
		Employee employee1 = new Employee("�����");
		Employee employee2 = new Employee("��Ʈ��");
		Employee employee3 = new Employee("��ֽ�");

		System.out.println(employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee3.getEmployeeId());
	}

}
