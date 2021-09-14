package ch09;

public class Employee {
	
	public static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee(String employeeName) {
		serialNum++;
		employeeId = serialNum;
		this.employeeName = employeeName;
	}
	// ���� 1. getEmployeeId
	public int getEmployeeId() {
		return employeeId;
	}
	// ���� 2. getEmployeeName
	public String getEmployeeName() {
		return employeeName;
	}
	// ���� 3. getDepartment;
	public String getDepartment() {
		return department;
	}
	
	// static �޼��� Ȱ��
	public static int getSerialNum() {
		// ���� static �޼��� �ȿ����� ��� ������ ����� �� ����.
		// why : ��ü�� ��������� ���� �����ؼ� ����� �� �ִ� static
		
		// department = "ȫ����";
		return serialNum;
	}
}















