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
	// 문제 1. getEmployeeId
	public int getEmployeeId() {
		return employeeId;
	}
	// 문제 2. getEmployeeName
	public String getEmployeeName() {
		return employeeName;
	}
	// 문제 3. getDepartment;
	public String getDepartment() {
		return department;
	}
	
	// static 메서드 활용
	public static int getSerialNum() {
		// 주의 static 메서드 안에서는 멤버 변수를 사용할 수 없다.
		// why : 객체가 만들어지기 전에 접근해서 사용할 수 있는 static
		
		// department = "홍보팀";
		return serialNum;
	}
}
















