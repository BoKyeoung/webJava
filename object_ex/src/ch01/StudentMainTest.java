package ch01;

public class StudentMainTest {

	public static void main(String[] args) {
		
		Object ob;
		
		Student student1 = new Student(1, "라이즈");
		Student student2 = new Student(2, "아크샨");
		
		Student student3 = new Student(2, "아크샨");

		// to String
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println("==================");
		
		if(student3.equals(student2)) {
			System.out.println("논리적 : 같은객체입니다.");
		}else {
			System.out.println("논리적 : 디른객체입니다.");
		}
		
	}

}
