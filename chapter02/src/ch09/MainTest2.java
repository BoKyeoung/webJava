package ch09;

public class MainTest2 {

	public static void main(String[] args) {
		
		// static 클래스 이름으로 접근가능하다.
		
		int tempNumber = Employee.getSerialNum();
		System.out.println(tempNumber);
		
		Employee employee1 = new Employee("김춘식");
		Employee employee2 = new Employee("이트린");
		Employee employee3 = new Employee("삼애쉬");

		System.out.println(employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee3.getEmployeeId());
	}

}
