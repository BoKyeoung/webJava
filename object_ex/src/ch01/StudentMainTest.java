package ch01;

public class StudentMainTest {

	public static void main(String[] args) {
		
		Object ob;
		
		Student student1 = new Student(1, "������");
		Student student2 = new Student(2, "��ũ��");
		
		Student student3 = new Student(2, "��ũ��");

		// to String
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println("==================");
		
		if(student3.equals(student2)) {
			System.out.println("���� : ������ü�Դϴ�.");
		}else {
			System.out.println("���� : �𸥰�ü�Դϴ�.");
		}
		
	}

}
