package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
//		Student student1 = new Student(); // <--������, �빮�ڷ� �����Ѵ�.
//		student1.name = "ȫ�浿";
//		student1.number = 1;
//		student1.grade = 3;

		Student student2 = new Student(2, "�̼���", 3);
		System.out.println(student2.name);
		
		student2.name = "Ƽ��";
		System.out.println(student2.name);
	}

}