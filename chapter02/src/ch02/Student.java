package ch02;

import java.util.Random;

public class Student {

	// ��ü�� �Ӽ��� ��� ������, ��ü�� ����� �޼���� �����Ѵ�.
	int studentId;
	String studentName;
	String address;
	
	// �޼��� ����
	public void study() {
		System.out.println(studentName + " �л��� ���θ� �մϴ�.");
	} // end of study
	
	public void breakTime() {
		System.out.println(studentName + " �л��� �޽��� �մϴ�.");
	} // end of breakTime
	
	public void showInfo() {
		System.out.println(studentId + " , " + studentName + ", " + address);
	} // end of showInfo
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "�����";
		studentKim.studentId = 1;
		studentKim.address = "������ ���ֽ�";
		
		//�޼��� ȣ��
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		System.out.println("===================");
		
		Student studentLee = new Student();
		studentLee.studentName = "�����";
		studentLee.studentId = 2;
		studentLee.address = "�λ�� ������";
		
		// ���� 1. study() �޼��� ȣ��
		studentLee.study();
		// ���� 2. breakTime() �޼��� ȣ��
		studentLee.breakTime();
		// ���� 3. showInfo() �޼��� ȣ��
		studentLee.showInfo();
		
		System.out.println("=========================");
		
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		
	} // end of main
	
	// �Լ� �����
	
	public static int randomNumber() {
		int value;
		Random random = new Random();
		value = random.nextInt(45) + 1; 
		// 0 ~ 44���� �������� ���ڸ� ��ȯ (+1 �߰�) -> 1 ~ 45 ���� ���� �� �ϳ��� ��ȯ.
		return value;
	}
	
}










